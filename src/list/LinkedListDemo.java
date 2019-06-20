package list;

/**
 *doubly linked list used internally linked list
 * it's not thread safe
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public LinkedListDemo(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(1);
        ll.add(3);
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
