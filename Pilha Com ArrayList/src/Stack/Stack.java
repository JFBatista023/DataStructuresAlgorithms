package Stack;

import java.util.ArrayList;

public class Stack<T> {

    private final ArrayList<T> stack = new ArrayList<>();

    public Stack() {
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void push(T elem) {
        stack.add(elem);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T top = stack.get(size() - 1);
        stack.remove(top);
        return top;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack.get(size() - 1);
    }

    @Override
    public String toString() {
        return "[" + stack + "]";
    }
}
