package Assignments.Collections;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        System.out.println("Camparator has been Called.");
//        return o1 - o2; // Ascending order
        return o2 - o1; // Descending order

    }
}
