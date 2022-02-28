package Program;

import Stack.Stack;

public class Program {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack.isEmpty());
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
