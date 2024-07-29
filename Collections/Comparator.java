compare-Comparator interface-compare two objects
  compareTo-Comperable interface- compare one  object
  The Comparable interface has compareTo(T obj) method which is used by sorting methods
  The comparator provides the two way of sorting.
  The comparable interface-natural ordering and The comparator interface has total ordering.
  The Comperator has more preference than the Comparable
  
  
 --> class:customcomperator
  
  package collections;

import java.util.Comparator;

public class CusomComperator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        return o2-o1;
    }
}
//When we want to print the top  elements
// 0 1 2 100
package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CusomComperator());
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
        
      System.out.println(pq);


    }


}
//output is:100,2
//order
//Here we using the another class which implements the comparator interface,we can do it by using lambda function also.
 PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
By using student class
  package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority1 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(39, 56));
        list.add(new Students(67, 67));
        list.add(new Students(78, 80));
        list.add(new Students(45, 59));
        list.add(new Students(90, 69));

        PriorityQueue<Students> pq = new PriorityQueue<>((a, b) ->
        {
            System.out.println("Comparator is called");
            return b.getPhysics() - a.getPhysics();
        });
        for(Students s:list)
        {
            pq.add(s);
        }
        List<Students> top2 = new ArrayList<>();
        int index = 0;
        while (!pq.isEmpty()) {
            if (index == 2)
                break;
            top2.add(pq.poll());
            index++;
        }
        System.out.println(top2);
        System.out.println(pq);

    }
}


