package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList list;

    public Stack() {
        list = new ImmutableLinkedList();
    }

    Object peek() {
        return list.get(0);
    }

    Object pop() {
        Object element = list.get(0);
        list = list.remove(0);
        return element;
    }

    void push(Object e) {
        list = list.add(0, e);
        System.out.println(list.toString());
    }


}