package xyz.dean.practice.design_pattern.observer;

public class LoggingListener implements EventListener {
    @Override
    public void update(String event, String fileName) {
        System.out.println("Logging file changes. file: " + fileName + ", event: " + event);
    }
}
