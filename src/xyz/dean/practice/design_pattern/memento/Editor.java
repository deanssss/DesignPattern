package xyz.dean.practice.design_pattern.memento;

public class Editor {
    private final StringBuilder text = new StringBuilder();

    public String getText() { return text.toString(); }
    public void append(String input) { text.append(input); }
    public Snapshot createSnapShot() { return new Snapshot(text.toString()); }
    public void restore(Snapshot snapshot) {
        text.replace(0, text.length(), snapshot.text);
    }

    public static class Snapshot {
        private final String text;
        private Snapshot(String text) { this.text = text; }
    }
}
