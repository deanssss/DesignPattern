package xyz.dean.practice.design_pattern.iterator;

public interface IterableCollection<T> {
    DIterator<T> iterator();
}
