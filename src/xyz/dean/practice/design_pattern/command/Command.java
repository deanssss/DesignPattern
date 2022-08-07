package xyz.dean.practice.design_pattern.command;

public abstract class Command {
    public Editor editor;
    private Editor.Snapshot backup;
    public Command(Editor editor) { this.editor = editor; }

    public void backup() { backup = editor.createSnapshot(); }
    public void undo() { editor.restore(backup); }

    public abstract boolean execute();
}
