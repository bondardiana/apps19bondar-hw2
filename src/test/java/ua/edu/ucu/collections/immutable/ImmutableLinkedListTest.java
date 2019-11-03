package ua.edu.ucu.collections.immutable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private ImmutableLinkedList newLinkedList1;
    private ImmutableLinkedList newLinkedList2;

    @Before
    public void SetUp() {
        newLinkedList1 = new ImmutableLinkedList();
        String[] IntList = {"1", "2", "3", "4", "5"};
        newLinkedList2 = new ImmutableLinkedList();
        newLinkedList2=newLinkedList2.add(1);
        newLinkedList2=newLinkedList2.add(2);
        newLinkedList2=newLinkedList2.add(3);
        newLinkedList2=newLinkedList2.add(4);
    }

    @Test
    public void testImmutableLinkedList() {
        assertNull(newLinkedList1.head);
        assertEquals(newLinkedList1.isEmpty(), true);
        assertEquals(newLinkedList1.size, 0);
    }


    @Test
    public void testImmutableLinkedListWithEls() {
        assertEquals(1, newLinkedList2.head.value);
        assertEquals(4, newLinkedList2.size());
        newLinkedList2=newLinkedList2.add(2, 22);
        assertEquals(22, newLinkedList2.get(2));
        newLinkedList2=newLinkedList2.remove(4);
        assertEquals(3, newLinkedList2.get(3));
        Object [] t ={111, 222};
        Object [] what_I_want ={1, 2,22,3,111,222};
        newLinkedList2= newLinkedList2.addAll(t);
        assertArrayEquals(newLinkedList2.toArray(), what_I_want);
        Object [] what_I_want2 = {1,111,222, 2,22,3,111,222};
        newLinkedList2= newLinkedList2.addAll(1,t);

        assertArrayEquals(newLinkedList2.toArray(), what_I_want2);
        Object [] what_I_want3 = {9,111,222, 2,22,3,111,222};
//        newLinkedList2=newLinkedList2.set(0,9);
//        assertArrayEquals(newLinkedList2.toArray(), what_I_want3);
        assertEquals(newLinkedList2.indexOf(111), 1);
        newLinkedList2=newLinkedList2.clear();
        assertNull(newLinkedList2.head);
        assertEquals(newLinkedList2.isEmpty(), true);
        assertEquals(newLinkedList2.size, 0);


    }


}


