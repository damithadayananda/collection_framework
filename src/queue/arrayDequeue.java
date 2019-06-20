package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * ArrayDequeue implement Dequeue interface which facilitate
 * to adding and deleting elements from both ends
 * ArrayDequeue is not thread safe
 * It's faster than ArrayList
 */
public class arrayDequeue {
    public arrayDequeue(){
        Deque<Integer> arrayDequeue = new ArrayDeque<>();
        arrayDequeue.add(3);
        arrayDequeue.add(4);
        arrayDequeue.add(2);
        arrayDequeue.add(1);
        //adding to head
        arrayDequeue.addFirst(20);
        //adding to tail
        arrayDequeue.addLast(30);

        arrayDequeue.push(10);
        Iterator<Integer> itr = arrayDequeue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
