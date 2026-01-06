package Assignments.Collections;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        // List 1
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(4);
        lst1.add(3);
        lst1.add(2);

        for (int x : lst1)
            System.out.println(x);

        System.out.println(lst1);

//list 2
        List<Integer> lst2 = new ArrayList<>(lst1);  /* Constructor -> public ArrayList(Collection<? extends E> c).
         It's making the copy of lst1(If I make changes in lst2,it won't affect lst1)*/
        lst2.add(5);
        lst2.add(6);

        System.out.println(lst2);

        //making changes in lst2.
        System.out.println("the modified value is " + lst2.set(1,100));// set() is used to replace element specified by index.returns the modified value.

        System.out.println(lst2);
        System.out.println(lst1);// no changes.


//List 3

        List<Integer> lst3 = new ArrayList<>();
        lst3.add(7);
        lst3.add(8);
        lst3.add(9);
//        lst3.addAll(lst2);
        lst3.addAll(lst1);//addAll() -> adds all elements from the specified collection obj(list).
        System.out.println(lst3);
//        System.out.println(lst1);

//list 4
        List<Integer> lst4 = lst1.subList(1,3); // Add the other list collection's elements of the specified index.
        System.out.println(lst4);
        // modifing elements ([2,3])
        lst4.set(0,105);
        System.out.println(lst4);
        System.out.println(lst1);// changes also made in lst1 because of shallow copy.



    }


}
