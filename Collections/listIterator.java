package Assignments.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);


        /* use ListIterator is used when implementing LinkedList,LinkedList Collection uses Doubly
        * -Linkedlist(can able to traverse bidirectional).LinkedList has two methods [next(),previous()]
        * for that purpose.      */
        ListIterator<Integer> iterator = ll.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }
}
