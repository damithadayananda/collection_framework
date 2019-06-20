package set;
/**
 * underlying data structure is HashTable
 * hashing use store elements so they are unique
 * object insert based on their hash code so order guaranteed
 * hashSet is not thread safe
 */

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {
    public hashSetDemo(){
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
