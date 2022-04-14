package fr.insideapp.sonarqube.swift.lang.antlr;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;

public class CustomTreeVisitor extends AbstractParseTreeVisitor implements ParseTreeItemVisitor {

    private final ParseTreeItemVisitor[] visitors;

    public CustomTreeVisitor(final ParseTreeItemVisitor... visitors) {
        this.visitors = visitors;
    }

    @Override
    public Object visit(final ParseTree tree) {

        final int n = tree.getChildCount();

        for (int i = 0; i < n; i++) {
            final ParseTree c = tree.getChild(i);
            visit(c);
        }
        for (final ParseTreeItemVisitor visitor : this.visitors) {
            visitor.apply(tree);
        }

        return null;
    }

    @Override
    public void fillContext(SensorContext context, AntlrContext antlrContext) {
        this.apply(antlrContext.getRoot());
        for (final ParseTreeItemVisitor visitor : this.visitors) {
            visitor.fillContext(context, antlrContext);
        }
    }

    @Override
    public void apply(ParseTree tree) {
        this.visit(tree);
    }
}
