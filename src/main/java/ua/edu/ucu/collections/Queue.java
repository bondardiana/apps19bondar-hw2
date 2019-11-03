package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList list;

    public Queue() {

        list = new ImmutableLinkedList();
    }
    public Object peek() {
        return list.get(0);
    }

    public Object dequeue() {
        Object el = list.get(0);
        list = list.remove(0);
        return el;
    }

    public void enqueue(Object e) {
        list = list.add(e);
    }
}