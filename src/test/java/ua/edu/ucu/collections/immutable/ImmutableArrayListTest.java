package ua.edu.ucu.collections.immutable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableArrayList newArrayList1;
    private ImmutableArrayList newArrayLList2;

    @Before
    public void SetUp() {
        newArrayList1 = new ImmutableArrayList();
        String[] IntList = {"1", "2", "3", "4", "5"};
        newArrayLList2 = new ImmutableArrayList();
        newArrayLList2=newArrayLList2.add(1);
        newArrayLList2=newArrayLList2.add(2);
        newArrayLList2=newArrayLList2.add(3);
        newArrayLList2=newArrayLList2.add(4);
    }

    @Test
    public void testImmutableArrayLList() {
        assertEquals(newArrayList1.isEmpty(), true);
        assertEquals(newArrayList1.size(), 0);
    }


     @Test
    public void testImmutableArrayLListWithEls() {
        assertEquals(1, newArrayLList2.elements[0]);
        assertEquals(4, newArrayLList2.size());
        newArrayLList2=newArrayLList2.add(2, 22);
        assertEquals(22, newArrayLList2.get(2));
        newArrayLList2=newArrayLList2.remove(4);
        assertEquals(3, newArrayLList2.get(3));
        Object [] t ={111, 222};
        Object [] what_I_want ={1, 2,22,3,111,222};
        newArrayLList2=newArrayLList2.add(t[0]);
        newArrayLList2=newArrayLList2.add(t[1]);
        assertArrayEquals(newArrayLList2.toArray(), what_I_want);
        Object [] what_I_want2 = {1,111,222, 2,22,3,111,222};
        newArrayLList2=newArrayLList2.add(1,t[0]);
        newArrayLList2=newArrayLList2.add(2, t[1]);

        assertArrayEquals(newArrayLList2.toArray(), what_I_want2);
        Object [] what_I_want3 = {9,111,222, 2,22,3,111,222};
//        newLinkedList2=newLinkedList2.set(0,9);
//        assertArrayEquals(newLinkedList2.toArray(), what_I_want3);
        assertEquals(newArrayLList2.indexOf(111), 1);


    }

}


