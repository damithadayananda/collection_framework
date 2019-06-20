package map;
/**
 * hashMap is not ordered collection
 * it use hashcode and equal method to get and put methods
 * hashMap is not thread safe and concurrentHash map should use in concurrent environments
 */

import java.util.HashMap;
import java.util.Map;

public class hashMapDemo {
    public hashMapDemo(){
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"dam");
        map.put(101,"daya");
        for(Map.Entry m:map.entrySet()){
            System.out.println("key:"+m.getKey()+",value:"+m.getValue());
        }

        for(String s:map.values()){
            System.out.println(s);
        }
    }
}
