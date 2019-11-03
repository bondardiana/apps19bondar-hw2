package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList{

    int size = 0;
    Node head;

    static class Node {

        Object value;
        Node next;


        private Node(Object value) {
            this.value = value;
            next = null;
        }

        private Node(Object value, Node next) {
            this.next = next;
        }

    }

    public ImmutableLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public ImmutableLinkedList add(Object el){
        if (size == 0){

            ImmutableLinkedList new_l = new ImmutableLinkedList();
            new_l.head = new Node(el);
            new_l.size=1;
            return new_l;

        }

        else{
            ImmutableLinkedList new_l = create_new();
            Node cur_node = new_l.head;
            while (cur_node.next!=null){
                cur_node=cur_node.next;
            }
            cur_node.next= new Node(el);
            new_l.size= size + 1;
            return new_l;

        }

    }
    public ImmutableLinkedList add(int value, Object el){
        if (value > size || value < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (size == 0){

            ImmutableLinkedList new_l = new ImmutableLinkedList();
            new_l.head = new Node(el);
            new_l.size = 1;
            return new_l;
        }

        else{
            ImmutableLinkedList new_l = create_new();
            Node cur_node = new_l.head;
            for (int counter = 0; counter < value-1; counter++){
                cur_node=cur_node.next;
            }
            Node a= cur_node.next;
            Node fut_node = new Node(el);
            cur_node.next = fut_node;
            cur_node.next.next = a;
            new_l.size+=1;
            return new_l;

        }

    }
    @Override
    public ImmutableLinkedList addAll(Object[] c) {
        ImmutableLinkedList newList = add(c[0]);
        for (int i = 1; i < c.length; i++) {
            System.out.println("4");
            newList = newList.add(c[i]);
        }
        return newList;
    }

    @Override
    public ImmutableLinkedList addAll(int index, Object[] c) {
        ImmutableLinkedList newList = add(index, c[0]);
        for (int i = 1; i < c.length; i++) {
            index+=1;
            System.out.println(index);
            newList = newList.add(index, c[i]);
        }
        return newList;
    }


    public ImmutableLinkedList create_new(){
        if (size == 0 ){
            return new ImmutableLinkedList();
        }

        ImmutableLinkedList new_list = new ImmutableLinkedList();
        new_list.size = size;
        Node actual_node = head;
        Node cur_node = new Node(actual_node.value);
        new_list.head= cur_node;

        while (actual_node.next!=null){
            actual_node=actual_node.next;
            cur_node.next = new Node(actual_node.value);
            cur_node=cur_node.next;
        }
        return new_list;

    }
    public String toString(){

        if (head == null){
            return "";
        }
        else {
            String line ="";
            Node act_node = head;
            line += act_node.value.toString();
            while (act_node.next!= null){
                act_node= act_node.next;
                line += ", "+act_node.value.toString();
        }
            return line;


    }
}
    @Override
    public Object get(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        else {
            Node currentNode = head;
            for (int counter = 0; counter < index; counter++) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        }

    }
    @Override
    public ImmutableLinkedList remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            ImmutableLinkedList new_l = create_new();
            new_l.head = new_l.head.next;
            return new_l;
        }
        else {
            ImmutableLinkedList new_l = create_new();
            Node cur_node = new_l.head;

            for (int counter = 0; counter < index-1; counter++){
                cur_node=cur_node.next;
            }

            Node a = cur_node.next.next;
            cur_node.next = a;
            new_l.size -= 1;
            return new_l;

        }
    }


    @Override
    public ImmutableLinkedList set(int index, Object e){
        ImmutableLinkedList new_l = remove(index);
        new_l= new_l.add(index, e);
        return new_l;
    }

    @Override
    public int indexOf(Object element){
        Node cur_n = head;
        int counter =0;
        while (cur_n != null) {
            if (cur_n.value == element) {
                return counter;
            }
            cur_n = cur_n.next;
            counter+=1;

        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableLinkedList clear() {
        return new ImmutableLinkedList();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int index = 0;
        Node currentNode = head;
        while (index < size) {
            result[index] = currentNode.value;
            currentNode = currentNode.next;
            index+=1;
        }
        return result;
    }

}





