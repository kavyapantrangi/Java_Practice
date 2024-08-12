package Threads;

public class Thread1 extends Thread{
    public Thread1(String threadname)
    {
        super(threadname);

    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello,i am running   "+ currentThread().getName()+i);
        }
    }

    public static void main(String[] args) {
        Thread1 th=new Thread1("thread1");
        System.out.println("The main thread is running");
        th.start();
        System.out.println("The main thread is ending");
    }
}
