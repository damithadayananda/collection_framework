package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsDemo {
    public collectionsDemo(){
        List<Integer> fruits = new ArrayList<>(10);
        Collections.addAll(fruits,1,5,3,12);

        List<Integer> sortedFruit= fruits;
        Collections.sort(fruits);

        for(Integer i:sortedFruit){
            System.out.println(i);
        }

        System.out.println(Collections.max(fruits));
    }
}
