package list;
/**
 * stack is a sub class of vector
 */

import java.util.Iterator;
import java.util.Stack;

public class stackDemo {
    public stackDemo(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(4);

        stack.pop();//pop remove the last insert value

        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
