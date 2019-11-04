package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList {
     Object[] elements;

    public ImmutableArrayList() {
        elements = new Object[0];
    }

    public ImmutableArrayList(Object[] source) {
        elements = source.clone();
    }

    @Override
    public ImmutableArrayList add(Object e) {
        return add(elements.length, e);
    }


    @Override
    public ImmutableArrayList add(int index, Object e) {

        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArr = new Object[elements.length + 1];
        for (int i=0; i < elements.length+1; i++){
            if (i<index) {
                newArr[i] = elements[i];
            }
            else if (i == index){

                newArr[i]=e;
            }
            else {
                newArr[i]=elements[i-1];
            }
        }
        return new ImmutableArrayList(newArr);
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        return addAll(elements.length, c);
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArr = new Object[elements.length + c.length];
        for (int i=0; i < elements.length+1; i+=1){
            if (i<index) {
                newArr[i] = elements[i];
            }
            else if (i >= index + c.length){
                newArr[i]= elements[i-index];
            }
            else{
                newArr[i] = c[i-index];
            }
        }
        return new ImmutableArrayList(newArr);

    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public ImmutableArrayList remove(int index) {
        if ( index >= elements.length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object[] newArr = new Object[elements.length - 1];
        for (int i=0; i < elements.length; i+=1){
            if (i < index) {
                newArr[i] = elements[i];
            }
            if (i > index){
                newArr[i-1]= elements[i-1];
            }
        }
        return new ImmutableArrayList(newArr);
    }


    @Override
    public ImmutableArrayList set(int index, Object e) {
        Object[] newArr = elements.clone();
        newArr[index] = e;
        ImmutableArrayList new_l= new ImmutableArrayList(newArr);
        return new_l;
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < elements.length; i++) {

            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {

        return elements.length;
    }

    @Override

    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override

    public Object[] toArray() {

        return elements.clone();

    }

    @Override
    public String toString() {
        String line ="";
        if (elements.length>0)
       {
           line+=elements[0];
           for (int i=1; i<elements.length; i++){
            line+= ", " +elements[i].toString();
        }
       }
        return line;
    }
}