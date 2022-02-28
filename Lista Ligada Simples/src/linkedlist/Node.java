package linkedlist;

public class Node<K> {

    protected K data;
    protected Node<K> next;

    protected Node(K data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data + " -> " + next;
    }
}
