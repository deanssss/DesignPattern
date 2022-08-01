package xyz.dean.practice.design_pattern.observer;

import java.util.LinkedList;
import java.util.List;

public class EventManager {
    private final List<EventListener> listeners = new LinkedList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String event, String fileName) {
        listeners.forEach(l -> l.update(event, fileName));
    }
}
