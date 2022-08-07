package xyz.dean.practice.design_pattern.command;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) { super(editor); }

    @Override
    public boolean execute() {
        editor.past(this);
        return true;
    }
}
