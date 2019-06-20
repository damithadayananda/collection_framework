package map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * linkedHashMap also implement map interface and
 * extends hashMap
 * difference is it maintain insertion order
 */
public class linkedHashMapDemo {
    public linkedHashMapDemo(){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"dam");
        linkedHashMap.put(2,"daya");
        for(Map.Entry m:linkedHashMap.entrySet()){
            System.out.println("key:"+m.getKey()+",value:"+m.getValue());
        }
    }
}
