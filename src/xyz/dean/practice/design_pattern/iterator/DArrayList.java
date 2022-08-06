package xyz.dean.practice.design_pattern.iterator;

public class DArrayList<T> implements IterableCollection<T> {
    final int length;
    private final T[] array;

    public DArrayList(int initSize) {
        length = initSize;
        //noinspection unchecked
        array = ((T[]) new Object[initSize]);
    }

    public T get(int index) {
        checkBounds(index);
        return array[index];
    }

    public void set(int index, T value) {
        checkBounds(index);
        array[index] = value;
    }

    private void checkBounds(int index) {
        if (index < 0 && index >= length) {
            String msg = "Array index out of range: " + length + ", but index is: " + index;
            throw new ArrayIndexOutOfBoundsException(msg);
        }
    }

    @Override
    public DIterator<T> iterator() {
        return new DArrayListIterator<>(this);
    }

    private static class DArrayListIterator<T> implements DIterator<T> {
        private final DArrayList<T> collection;
        private int curIndex= 0;

        public DArrayListIterator(DArrayList<T> collection) { this.collection = collection; }

        @Override public boolean hasMore() { return curIndex + 1 < collection.length; }
        @Override public T get() { return collection.get(curIndex); }
        @Override public void next() { curIndex++; }
    }
}
