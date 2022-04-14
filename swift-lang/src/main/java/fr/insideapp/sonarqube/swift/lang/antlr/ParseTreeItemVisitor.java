package fr.insideapp.sonarqube.swift.lang.antlr;

import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.sensor.SensorContext;

public interface ParseTreeItemVisitor {
    void apply(ParseTree tree);

    void fillContext(SensorContext context, AntlrContext antlrContext);
}