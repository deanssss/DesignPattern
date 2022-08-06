package xyz.dean.practice.design_pattern.iterator;

public class Main {
public static void main(String[] args) {
    int size = 5;
    DArrayList<String> array = new DArrayList<>(size);
    DLinkedList<String> linked = new DLinkedList<>();
    for (int i = 0; i < array.length; i++) {
        array.set(i, "Array value " + i);
        linked.add("Linked value " + i);
    }
    printAll(array);
    printAll(linked);
}

private static <T> void printAll(IterableCollection<T> collection) {
    DIterator<T> iterator = collection.iterator();
    while (iterator.hasMore()) {
        iterator.next();
        T value = iterator.get();
        System.out.print("" + value + ",");
    }
    System.out.println();
}
}
