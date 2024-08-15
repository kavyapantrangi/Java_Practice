package Threads;

import com.sun.source.tree.SynchronizedTree;

public class Stack {
    private int[]array;
    private int stackTop;
    Object lock;
    public Stack (int capacity )
    {
        array=new int[capacity];
        stackTop=-1;
        lock=new Object();
    }
public boolean isEmpty()
{
    return stackTop<0;
}
public boolean isFull()
{
    return stackTop>=array.length-1;
}
public boolean push(int element) {
    synchronized (lock) {
        if (isFull()) return false;
        ++stackTop;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        array[stackTop] = element;
        return true;
    }
}
public  int pop() {
    synchronized (lock) {
        if (isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        stackTop--;
        return obj;
    }
}
}
-->Whenevere we are using synchronized keyword inside the method then lock should be explicitly needed
    ,but when its is declared when the method is declared then no lock requires
