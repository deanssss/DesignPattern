package xyz.dean.practice.design_pattern.observer.eventbus;

public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Main());

        eventBus.post("Success");
        eventBus.post(100);
    }

    @Subscribe
    public void onEvent(String event) {
        System.out.println("Received string event " + event +".");
    }

    @Subscribe
    public void onEvent(int event) {
        System.out.println("Received integer event " + event + ".");
    }
}
