The Queue extends the collection interface with the following methods
  --boolean add(E element)
  --boolean offer(E element)
  --E poll()
  --E remove()
  --E peek()
  --E element()
  --Deque:
the deque interface extends the Queue interface to allow double-ended queues
  the methods :
--boolean offerFirst(E element)
--boolean offerLast(E element) Queue equivqlent :offer()
-- void push(E element) synonym:addFirst()
--void addFirst(E element);
--void addLast(E element) Queue equivalent add()
  package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<Integer>queu=new LinkedList<>();
        queu.offer(2);
        queu.offer(5);
        System.out.println(queu.peek());
        System.out.println(queu.poll());
        System.out.println(queu.peek());
        System.out.println(queu.isEmpty());
    }
}
