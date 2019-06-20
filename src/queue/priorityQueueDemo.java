package queue;

/**
 * priority queue are used when the object are supposed to processed
 * based on priority.
 * can't create create priority queue with object that are  non comparable
 * priority queue use Comparable and comparator for processing priority
 * if there is multiple object with same ordering it poll anyone of them randomly
 * is not thread safe
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueDemo {
    public priorityQueueDemo(){
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("Java");
        queue.add("Python");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());

        System.out.println("iterating through element");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.poll(); //remove top priority element
        queue.clear();//remove all element in queue
    }
}
