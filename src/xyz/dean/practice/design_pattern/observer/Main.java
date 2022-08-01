package xyz.dean.practice.design_pattern.observer;

public class Main {
public static void main(String[] args) {
    Editor editor = new Editor();
    EventListener logger = new LoggingListener();
    EventListener emailAlerts = new EmailAlertListener("admin@example.com");
    editor.events.subscribe(logger);
    editor.events.subscribe(emailAlerts);
    editor.openFile("data.text");
    editor.events.unsubscribe(emailAlerts);
    editor.saveFile();
}
}
