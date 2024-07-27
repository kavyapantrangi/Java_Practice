--> Priority Queue works on priority.
-->The implementation is based on priority heap,a tree like structure that yields an element at the head 
  of the queue according to the priority ordering ,which is defined by natural ordering.
  -->Elemetnts in Priority Queue is not in soring order.
  ackage collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        List<Integer> top2 = new ArrayList<>();
        int index = 0;
        while (!pq.isEmpty()) {
            if (index == 2)
                break;
            top2.add(pq.poll());
            index++;
        }
        System.out.println(top2);
        System.out.println(pq.poll());
    }


}
 Example 2:By using the priority of students marks
  

  
