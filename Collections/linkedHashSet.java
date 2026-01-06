package Assignments.Collections;

// LinkedHashSet Class is extends HashSet for specific use case : ** maintains Insertion Order **

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();

        s.add(67);
        s.add(34);
        s.add(56);
        s.add(2);

        System.out.println(s); /* It's maintains linkes through every elements in the Set,so it returns in
        the Insertion Order */

    }
}
