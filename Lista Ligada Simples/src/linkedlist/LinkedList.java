package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList<T>{

    private Node<T> head = null;
    private int size;

    public LinkedList() {
    }

    private boolean isEmpty() {
        return head == null;
    }

    private Node<T> getNode(int index) {
        Node<T> pointer = head;
        for (int i = 0; i < index; i++) {
            if (pointer != null) {
                pointer = pointer.next;
            }
        }
        return pointer;
    }

    public boolean append(T lastData) {
        if (head == null) {
            head = new Node<T>(lastData);
        }
        else {
            Node<T> pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node<T>(lastData);
        }

        size++;
        return true;
    }

    public boolean insert(T elem, int index) {
        Node<T> newNode = new Node<T>(elem);

        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        else if (index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        else if (index == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<T> pointer = getNode(index - 1);
            newNode.next = pointer.next;
            pointer.next = newNode;
        }

        size++;
        return true;
    }

    public T pop() {
        T lastData;

        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        else if (head.next == null) {
            lastData = head.data;
            head = null;
        }
        else {
            Node<T> pointer = head;
            while (pointer.next.next != null) {
                pointer = pointer.next;
            }
            lastData = pointer.data;
            pointer.next = null;
        }

        size--;
        return lastData;
    }

    public boolean removeByElem(T elem) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        else if (head.data == elem) {
            head = head.next;
            size--;
            return true;
        }
        else {
            Node<T> ancestor = head;
            Node<T> pointer = head.next;
            while (pointer != null) {
                if (pointer.data == elem) {
                    ancestor.next = pointer.next;
                    pointer.next = null;
                    size--;
                    return true;
                }
                ancestor = pointer;
                pointer = pointer.next;
            }
            throw new NoSuchElementException("This element doesn't exist.");
        }
    }

    public boolean removeByIndex(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        else if (index == 0) {
            head = head.next;
        }
        else {
            Node<T> ancestor = head;
            Node<T> pointer = getNode(index);
            ancestor.next = pointer.next;
        }

        size--;
        return true;
    }

    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return "[" + head + "]";
    }
}
