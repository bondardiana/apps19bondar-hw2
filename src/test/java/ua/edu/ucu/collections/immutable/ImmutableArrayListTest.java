package ua.edu.ucu.collections.immutable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testempty(){

        ImmutableArrayList newll1 = new ImmutableArrayList();
        assertEquals(newll1.size(), 0);
        assertEquals(newll1.isEmpty(), true);
    }

    @Test
    public void testaddingone(){
        ImmutableArrayList newll1 = new ImmutableArrayList();

        for (int i=0; i<5; i++) {
            newll1 = newll1.add(i);
        }
        assertEquals(newll1.size(), 5);

        newll1=newll1.add(3, 10);

        assertEquals(newll1.size(), 6);
        assertEquals(newll1.elements[0], 0);
        assertEquals(newll1.get(3), 10);
        try{
            newll1=newll1.add(-1, 88);
        }
        catch(IndexOutOfBoundsException e){

            assertTrue(true);
        }

    }
    @Test
    public void testaddall(){
        ImmutableArrayList newll1 = new ImmutableArrayList();
        Object []arr = {111,222,333};
        Object []arr2 ={7777, 777, 77, 7};
        for (int i=0; i<5; i++) {
            newll1 = newll1.addAll(arr);
        }
        assertEquals(newll1.size(), 15);

        newll1=newll1.addAll(1, arr2);

        assertEquals(newll1.size(), 19);
        assertEquals(newll1.elements[0], 111);
        assertEquals(newll1.get(3), 77);
        try{
            newll1=newll1.addAll(-1, arr);
        }
        catch(IndexOutOfBoundsException e){

            assertTrue(true);
        }
    }

    @Test
    public void testremove(){
        ImmutableArrayList newll1 = new ImmutableArrayList();
        Object []arr = {111, 222,333};
        Object []arr2 ={7777, 777, 77, 7};
        for (int i=0; i<2; i++) {
            newll1 = newll1.addAll(arr);
            newll1 = newll1.addAll(arr2);
        }

        assertEquals(newll1.size(), 14);

        for (int i=0; i<10; i++){
            newll1=newll1.remove(4);
        }


        assertEquals(newll1.size(), 4);
        assertEquals(newll1.elements[0], 111);
        assertEquals(newll1.get(3), 7777);

        try{
            newll1=newll1.remove(444);
        }
        catch(IndexOutOfBoundsException e){

            assertTrue(true);
        }

    }

    @Test
    public void testset(){

        ImmutableArrayList newll1 = new ImmutableArrayList();
        for (int i=0; i<7; i++) {
            newll1 = newll1.add(i);
        }
        newll1=newll1.set(5, 55);
        assertEquals(newll1.size(), 7);
        assertEquals(newll1.get(5), 55);

        try{
            newll1=newll1.set(-1, 9);
        }
        catch(IndexOutOfBoundsException e){

            assertTrue(true);
        }
    }

    @Test
    public void testindexof(){
        ImmutableArrayList newll1 = new ImmutableArrayList();
        for (int i=0; i<7; i++) {
            newll1 = newll1.add(i);
        }
        assertEquals(newll1.indexOf(3), 3);
        assertEquals(newll1.indexOf(7), -1);


    }
    @Test
    public void testclear(){
        ImmutableArrayList newll1 = new ImmutableArrayList();
        for (int i=0; i<7; i++) {
            newll1 = newll1.add(i);
        }
        newll1= newll1.clear();
        assertEquals(newll1.size(), 0);
    }

    @Test
    public void testtoarr(){
        Object [] arr={0,1,2,3,4,5,6};
        ImmutableArrayList newll1 = new ImmutableArrayList();
        for (int i=0; i<7; i++) {
            newll1 = newll1.add(i);
        }
        Object [] arr2 = newll1.toArray();
        assertArrayEquals(arr2, arr);
    }
    @Test
    public void testtostring(){
        String line= "0, 1, 2, 3, 4, 5, 6";
        ImmutableArrayList newll1 = new ImmutableArrayList();
        for (int i=0; i<7; i++) {
            newll1 = newll1.add(i);
        }
        String line2= newll1.toString();
        assertEquals(line, line2);
    }
}




