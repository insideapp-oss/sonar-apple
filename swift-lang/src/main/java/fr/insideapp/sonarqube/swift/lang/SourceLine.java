package fr.insideapp.sonarqube.swift.lang;

public final class SourceLine {

    private final int count;
    private final int start;
    private final int end;
    private final int line;

    public SourceLine(final int line, final int count, final int start, final int end) {
        this.line = line;
        this.count = count;
        this.start = start;
        this.end = end;

    }

    @Override
    public String toString() {
        return "SourceLine [line=" + line + ", count=" + count + ", start=" + start + ", end=" + end + "]";
    }

    public int getLine() {
        return line;
    }

    public int getCount() {
        return count;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

}
