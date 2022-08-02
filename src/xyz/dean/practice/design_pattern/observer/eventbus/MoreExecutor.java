package xyz.dean.practice.design_pattern.observer.eventbus;

import java.util.concurrent.Executor;

public class MoreExecutor {
    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    private enum DirectExecutor implements Executor {
        INSTANCE;

        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }
}
