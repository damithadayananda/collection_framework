package Iterating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * iterator traverse only forward direction
 * list iterator can be use to forward and reverse both
 * list iterator can use to add remove and set while iterator only for remove
 */
public class iterator {
    public void iterator(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println("value:"+itr.next());
        }

        ListIterator<String> litr = list.listIterator();
        while (litr.hasNext()){
            System.out.println("value:"+litr.next());
        }

        while (litr.hasPrevious()){
            if(litr.previous().equals("A")){
                litr.remove();
            }
        }
    }
}
