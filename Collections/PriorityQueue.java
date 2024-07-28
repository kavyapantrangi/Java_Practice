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
// Example 2:By using the priority of students marks

Priority Queue
   package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//            if (index == 2)
//                break;
//            top2.add(pq.poll());
//            index++;
//        }
//        System.out.println(top2);
//        System.out.println(pq.poll());
        List<Students>list=new ArrayList<>();
        list.add(new Students(39,56));
        list.add(new Students(67,67));
        list.add(new Students(78,80));
        list.add(new Students(45,59));
        list.add(new Students(90,69));

        PriorityQueue<Students> pq = new PriorityQueue<>(list);
        List<Students> top2 = new ArrayList<>();
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
// Students Class:
package collections;

public class Students implements Comparable<Students>{
    private int maths;
    private int  physics;

    public Students(int maths,int physics) {
        this.maths=maths;
        this.physics=physics;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getPhysics() {
        return physics;
    }

    public int getMaths() {
        return maths;
    }

    @Override
    public String toString() {
        return "Students{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(Students o) {
//       if(this.maths<o.maths)
//           return -1;
//       if(this.maths>o.maths)
//           return 1;
//       if(this.maths==o.maths)
//           return 0;
       return this.maths-o.maths;

    }


//    public int compareTo(Object o) {
//        return 0;
//    }
}


  

  
