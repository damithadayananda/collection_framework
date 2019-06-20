package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public LinkedHashSetDemo(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(1));
        System.out.println(linkedHashSet.add(4));
        System.out.println(linkedHashSet.add(2));
        System.out.println(linkedHashSet.add(1));
        Iterator<Integer> itr=linkedHashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
