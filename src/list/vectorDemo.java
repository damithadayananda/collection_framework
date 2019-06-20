package list;

/**
 * vector also use dynamic array
 * its synchronized(thread safe)
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {
    public vectorDemo(){
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(1);
        vector.add(3);

        Iterator<Integer> itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
