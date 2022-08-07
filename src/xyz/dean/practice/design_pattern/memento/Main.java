package xyz.dean.practice.design_pattern.memento;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Editor editor = new Editor();
    SnapshotHelper helper = new SnapshotHelper(editor);
    Scanner scanner = new Scanner(System.in);
    label: while (scanner.hasNext()) {
        String input = scanner.nextLine();
        switch (input) {
            case ":list":
                System.out.println(editor.getText());
                break;
            case ":undo":
                helper.undo();
                break;
            case ":quit":
                break label;
            default:
                helper.backup();
                editor.append(input);
                break;
        }
    }
}
}
