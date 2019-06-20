package list;

import java.util.Iterator;
import java.util.List;

/**
 *inside arrayList use dynamic array
 * arrayList is non-synchronized no thread safe
 * it accept duplicate
 * it's good for sorting
 */
public class ArrayListDemo {
    public ArrayListDemo(){
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
