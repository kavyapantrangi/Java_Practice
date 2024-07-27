package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(45);
        //last in first out principle
        while (!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println("Deque implementation");
        Deque<Integer>dq=new ArrayDeque<>();
        dq.offerFirst(4);
        dq.offerFirst(6);
        dq.offerFirst(45);
        dq.offerFirst(78);
        dq.offerFirst(569);
        dq.offerFirst(563);
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
//        dq.offerFirst();
        dq.pollFirst();
        System.out.println(dq);

    }
}
