package program;

import linkedlist.LinkedList;

public class Program {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println(linkedList);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        System.out.println(linkedList);

        linkedList.removeByIndex(1);
        System.out.println(linkedList);

        linkedList.insert(2, 1);
        linkedList.append(4);
        System.out.println(linkedList);
        linkedList.insert(5, 3);
        System.out.println(linkedList);
    }
}
