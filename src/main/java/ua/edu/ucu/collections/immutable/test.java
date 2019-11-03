package ua.edu.ucu.collections.immutable;
public class test{
    public static void main(String[] args) {
//        ImmutableLinkedList kek = new ImmutableLinkedList();
//
//        kek = kek.add(5);
//        kek = kek.add(51);
//        kek = kek.add(445);
//        Object [] t_list = {2,4,1,333};
//
//        System.out.println(kek.toString());
//        kek = kek.addAll(1, t_list);
//
//        System.out.println(kek.toString());
//
//        System.out.println(kek.toString());
//
//      kek= kek.set(2, 22);
//
//        System.out.println(kek.toString());
//
//        Object[] k= kek.toArray();
//        for(int i =0; i< k.length; i+=1){
//            System.out.print(k[i]);
//        }

        ImmutableArrayList kek = new ImmutableArrayList();

        kek = kek.add(5);
        kek = kek.add(51);
        kek = kek.add(445);
        Object [] t_list = {2,4,1,333};

        System.out.println(kek.toString());
        kek = kek.addAll(1, t_list);

        System.out.println(kek.toString());

        System.out.println(kek.toString());

        kek= kek.set(2, 22);

        System.out.println(kek.toString());

        Object[] k= kek.toArray();
        for(int i =0; i< k.length; i+=1){
            System.out.print(k[i]);
        }
    }
    }

