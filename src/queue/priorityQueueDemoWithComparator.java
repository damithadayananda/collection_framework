package queue;

import java.util.PriorityQueue;

public class priorityQueueDemoWithComparator {
    public priorityQueueDemoWithComparator(){
        PriorityQueue<customer> customerPriorityQueue = new PriorityQueue<>(customer.idComparator);
        customer c2 = new customer(10,"child");
        customer c =new customer(1,"baby");
        customer c3 = new customer(50,"elder");
        customer c4 = new customer(17,"young");
        customerPriorityQueue.add(c);
        customerPriorityQueue.add(c2);
        customerPriorityQueue.add(c3);
        customerPriorityQueue.add(c4);

        System.out.println("peak:"+customerPriorityQueue.peek());
    }
}
