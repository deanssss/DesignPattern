package xyz.dean.practice.design_pattern.command;

public class CutCommand extends Command {
    public CutCommand(Editor editor) { super(editor); }

    @Override
    public boolean execute() {
        editor.cut(this);
        return true;
    }
}
