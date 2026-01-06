package Assignments.Collections;

/* Map is not a Collection in java.Map has two parameters : key and value.Key must be unique but value can
   be same.           */

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();

        hm.put("raaj",7);// creating elements in map.
        hm.put("jay",8);
        hm.put("kavi",9);
        hm.put("aish",10);
        hm.remove("aish"); // to remove the particular element from the Map.

        System.out.println(hm.get("kavi"));// used to get the value of the particular key.
        System.out.println(hm.get("jedfb")); // returns null if key is not found.

        System.out.println(hm.containsKey("jay")); // returns boolean value according to whether the particular key is available or not.




    }
}
