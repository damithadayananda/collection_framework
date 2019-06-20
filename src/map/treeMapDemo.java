package map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TreeMap maintain ascending order of key
 */
public class treeMapDemo {
    public treeMapDemo(){
//        SortedMap<String,String> fileExtensions = new TreeMap<>();
//        fileExtensions.put("python", ".py");
//        fileExtensions.put("c++", ".cpp");
//        fileExtensions.put("kotlin", ".kt");
//        fileExtensions.put("golang", ".go");
//        fileExtensions.put("java", ".java");
//
//        System.out.println(fileExtensions);

        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"dam");
        map.put(5,"daya");
        map.put(3,"mal");

        for(Map.Entry m : map.entrySet()){
            System.out.println("key:"+m.getKey()+",value:"+m.getValue());
        }
    }
}
