package xyz.dean.practice.design_pattern.command;

import javax.swing.*;
import java.awt.*;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private final CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("TextEditor");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C"); buttons.add(ctrlC);
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(this)));
        JButton ctrlX = new JButton("Ctrl+X"); buttons.add(ctrlX);
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(this)));
        JButton ctrlV = new JButton("Ctrl+V"); buttons.add(ctrlV);
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(this)));
        JButton ctrlZ = new JButton("Ctrl+Z"); buttons.add(ctrlZ);
        ctrlZ.addActionListener(e -> undo());
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void copy() {
        clipboard = textField.getSelectedText();
    }

    public void cut(Command command) {
        String selectedText = textField.getSelectedText();
        if (selectedText == null || selectedText.isEmpty()) return;
        command.backup();
        textField.setText(cutString(textField.getText()));
        clipboard = selectedText;
    }

    private String cutString(String source) {
        String start = source.substring(0, textField.getSelectionStart());
        String end = source.substring(textField.getSelectionEnd());
        return start + end;
    }

    public void past(Command command) {
        if (clipboard == null || clipboard.isEmpty()) return;
        command.backup();
        textField.insert(clipboard, textField.getCaretPosition());
    }

    public Snapshot createSnapshot() { return new Snapshot(textField.getText()); }
    public void restore(Snapshot snapshot) { textField.setText(snapshot.text); }

    private void executeCommand(Command command) {
        if (command.execute()) history.push(command);
    }

    private void undo() {
        if (history.isEmpty()) return;
        Command command = history.pop();
        if (command != null) command.undo();
    }

    public static class Snapshot {
        private final String text;
        private Snapshot(String text) { this.text = text; }
    }
}
