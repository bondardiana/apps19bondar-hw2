package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
        stack = new Stack();
        for (int i=1; i < 6; i++){

                    stack.push(i);

                }

        }


    @Test
    public void testPeek() {
        assertEquals(stack.peek(), 5);
        assertEquals(stack.peek(), 5);
    }

    @Test
    public void testPop() {
        stack.pop();
        assertEquals(stack.peek(), 4);
        stack.pop();
        stack.pop();
        assertEquals(stack.peek(), 3);
    }

    @Test
    public void testPush() {
        stack.push(6);
        assertEquals(stack.peek(), 6);
        stack.push(7);
        assertEquals(stack.peek(), 7);
        stack.pop();
        assertEquals(stack.peek(), 6);

    }
}
