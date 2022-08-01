package xyz.dean.practice.design_pattern.observer;

public class EmailAlertListener implements EventListener {
    private String address;
    public EmailAlertListener(String address) { this.address = address; }

    @Override
    public void update(String event, String fileName) {
        System.out.println("Send email to "+ address + ", content: File changed. file: " + fileName + ", event: " + event);
    }
}
