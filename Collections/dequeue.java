package Assignments.Collections;

// Deque : Double Ended Queue,add and remove elements from both the ends.

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        // Deque is a Inteface,ArrayDeque is Class that implements Deque Interface.
        Deque<Integer> dq = new ArrayDeque<>();

        // Deque can used as a "Queue,Deque and also as Stack. "


        // Stack : LIFO
        dq.offerFirst(12); // adds elements at the top everytime.
        dq.offerFirst(15);
        System.out.println(dq);

        dq.pollFirst(); // deletes element at top everytime.
        System.out.println(dq);
        dq.pollFirst();

        // Queue : FIFO
        dq.offerLast(17);// adds elements at bottom.
        dq.offerLast(18);
        System.out.println(dq);

        dq.pollFirst();// deletes element that adds lastly.
        System.out.println(dq);


    }
}
