package linkedlist;

public class LinkedList<T>{

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size;

    public LinkedList() {
    }

    public void addFirst(T elem) {
        Node<T> newest = new Node<>(elem);

        if (isEmpty()) {
            head = newest;
            tail = newest;
        }
        else {
            newest.next = head;
            head = newest;
        }

        size++;
    }

    public void addLast(T elem) {
        Node<T> newest = new Node<>(elem);

        if (head == null) {
            head = newest;
        }
        else {
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        head = head.next;
        size--;
    }

    public void removeLast() {
        Node<T> pointer = head;
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        while (pointer.next != tail) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    public T first() {
        return head.data;
    }

    public T last() {
        return tail.data;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "[" + head + "]";
    }
}
