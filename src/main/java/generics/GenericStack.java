package generics;

import java.util.ArrayList;

public class GenericStack<E> {
    private final ArrayList<E> list = new ArrayList<>();

    private static <E extends Comparable<E>> E getMax(E object1, E object2) {

        if (object1.compareTo(object2) > 0) {
            return object1;
        } else {
            return object2;
        }

    }

    public static <E extends Comparable<E>> E getStackMaxValue(GenericStack<E> stack) {
        E max = stack.pop();
        while (!stack.isEmpty()) {
            E value = stack.pop();
            max = getMax(max, value);
        }
        return max;
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
