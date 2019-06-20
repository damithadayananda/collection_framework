package set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * tree set maintain natural order of its elements
 * it can't contain duplicates
 * order is get from natural ordering or supplied comparator
 * it's not thread safe
 */
public class treeSetDemo {
    public treeSetDemo(){
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] num = numbers.toArray(new Integer[numbers.size()]);
        for(int i=0;i<num.length;i++){
           System.out.println(num[i]);
        }
    }
}
