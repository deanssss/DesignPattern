package xyz.dean.practice.design_pattern.memento;

import java.util.Stack;

public class SnapshotHelper {
    private final Editor editor;
    private final Stack<Editor.Snapshot> mementos = new Stack<>();
    public SnapshotHelper(Editor editor) { this.editor = editor; }

    public void backup() {
        Editor.Snapshot snapshot = editor.createSnapShot();
        mementos.push(snapshot);
    }

    public void undo() {
        if (mementos.isEmpty()) return;
        Editor.Snapshot snapshot = mementos.pop();
        editor.restore(snapshot);
    }
}
