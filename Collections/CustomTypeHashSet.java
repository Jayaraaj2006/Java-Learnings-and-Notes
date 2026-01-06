package Assignments.Collections;

import java.util.HashSet;
import java.util.Set;

public class CustomTypeHashSet {
    public static void main(String[] args) {
        Set<StudentComparable> sMarks = new HashSet<>();

        sMarks.add(new StudentComparable(70,45));
        sMarks.add(new StudentComparable(100,80));
        sMarks.add(new StudentComparable(50,68));// 5 students marks.
        sMarks.add(new StudentComparable(75,76));
        sMarks.add(new StudentComparable(95,99));

        System.out.println(sMarks.contains(new StudentComparable(70,45))); /* It returns false because we need to implement
        HashCode() and equals() methods for customClass type.

        Cause for Implementing these methods:
        -hashCode() -> hashCode() is implemented to place an object into the correct bucket.
        -equals() -> equals() is implemented to compare objects for logical equality and for neglect duplicate values.

           */

        // After Implemented the methods.

        System.out.println(sMarks.contains(new StudentComparable(70,45))); // returns true.

    }
}
