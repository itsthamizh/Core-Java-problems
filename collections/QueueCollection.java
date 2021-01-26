package learn.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueCollection {
    public static void main(String args[]){

        Queue<Object> queue = new PriorityQueue();
        queue.add("madras university");
        queue.add("anna university");
        queue.add("kalasalingam university");
        queue.add("annamalai university");
        queue.add("alagappa university");

        System.out.println("The size of : \n"+ queue.size());
        System.out.println("The value of : "+ queue.element());
        System.out.println("This value for : "+ queue.peek());

        Iterator i = queue.iterator();
        System.out.println("\nThis for printing the before remove operation :");
        for(Object name: queue){
            System.out.println(i.next());
        }

        queue.remove();
        queue.poll();

        Iterator io =queue.iterator();
        System.out.println("\nThis for printing the after remove operation :");
        for(Object name : queue){
            System.out.println(io.next());
        }
        System.out.println("\nThe size of : \n"+ queue.size());

    }
}
