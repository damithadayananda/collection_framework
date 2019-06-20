package sorting;
/**
 * java Arrays provide bunch of public static methods for
 * sort,compare,binarySearch,equals,copyOf
 *
 * java collection provide bunch of public static method to operate on Collections
 * including Collection.sort,Collection.reverse on list
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortingPrimitiveTypes {
    public sortingPrimitiveTypes(){
        int[] intArr = {1,5,2,9};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        Collections.sort(strList);
        for(String str:strList){
            System.out.println(str);
        }
    }
}
