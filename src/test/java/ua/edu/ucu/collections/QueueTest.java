package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue;

    @Before
    public void setUp() {
        queue = new Queue();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);
        queue.enqueue(55);
    }

    @Test
    public void testPeek() {
        assertEquals(queue.peek(), 11);
        assertEquals(queue.peek(), 11);
    }

    @Test
    public void testDequeue() {
        Object el = queue.dequeue();
        assertEquals(el,11);
        assertEquals(queue.peek(), 22);
        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.peek(), 44);
    }

    @Test
    public void testEnqueue() {
        Queue q = new Queue();
        q.enqueue(11);
        assertEquals(q.peek(), 11);
        q.enqueue(22);
        assertEquals(q.peek(), 11);
        q.dequeue();
        assertEquals(q.peek(), 22);
    }

}