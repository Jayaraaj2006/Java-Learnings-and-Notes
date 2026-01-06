package Assignments.Collections;

import java.util.*;
import java.util.concurrent.Callable;

public class Collection_Interface {
    public static void main(String[] args) {
        Collection<Float> a = new ArrayList<>();
        a.add(12.3F);
        a.add(34.0F);
        a.add(88.0F);
        a.remove(88.0F);
        a.remove(34.0F);
        System.out.println(a);
        Collection<Float> b = new ArrayList<>();
        b.add(111.0F);
        a.addAll(b); // Used to add elements from other Collection.
        System.out.println(a);

        Collection<Integer> obj = new ArrayList<>();
        obj.add(12);
        obj.add(13);
        obj.add(14);

        Iterator<Integer> obj1 = obj.iterator();
        while(obj1.hasNext()) // -> Returns true if collection has next element.
        {
            System.out.println(obj1.next()); // -> Used to print next element from the Collection.
        }
//        for(int i : obj){
//            System.out.println(i);    // this is also do the same as Iterator.
//        }


    }
}