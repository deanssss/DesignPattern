package xyz.dean.practice.design_pattern.iterator;

public class DLinkedList<T> implements IterableCollection<T> {
    private Node<T> head;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = newNode;
        }
    }

    @Override
    public DIterator<T> iterator() { return new DLinkedListIterator(); }

    public static class Node<T> {
        public Node<T> next;
        public T value;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private class DLinkedListIterator implements DIterator<T> {
        private Node<T> curNode = head;

        @Override public boolean hasMore() { return curNode != null && curNode.next != null; }
        @Override public T get() { return curNode.value; }
        @Override public void next() { curNode = curNode.next; }
    }
}
