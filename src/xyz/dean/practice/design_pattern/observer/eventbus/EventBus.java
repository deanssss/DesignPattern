package xyz.dean.practice.design_pattern.observer.eventbus;

import java.util.List;
import java.util.concurrent.Executor;

public class EventBus {
    private final Executor executor;
    private final ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(MoreExecutor.directExecutor());
    }

    public EventBus(Executor executor) {
        this.executor = executor;
    }

    public void register(Object observer) {
        registry.register(observer);
    }

    public void post(Object event) {
        List<ObserverAction> actions = registry.matchObserverActions(event);
        actions.forEach(action -> executor.execute(() -> action.execute(event)));
    }
}
