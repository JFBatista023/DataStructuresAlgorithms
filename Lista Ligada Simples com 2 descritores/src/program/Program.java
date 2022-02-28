package program;

import linkedlist.LinkedList;

public class Program {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1);
        linkedList.addLast(2);
        System.out.println(linkedList);

        linkedList.addLast(3);
        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.addFirst(1);
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.first());
        System.out.println(linkedList.last());
        System.out.println(linkedList.size());
    }
}
