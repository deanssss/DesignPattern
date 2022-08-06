package xyz.dean.practice.design_pattern.iterator;

public interface DIterator<T> {
    boolean hasMore();
    T get();
    void next();
}
