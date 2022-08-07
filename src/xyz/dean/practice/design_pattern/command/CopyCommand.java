package xyz.dean.practice.design_pattern.command;

public class CopyCommand extends Command {
    public CopyCommand(Editor editor) { super(editor); }

    @Override
    public boolean execute() {
        editor.copy();
        return false;
    }
}
