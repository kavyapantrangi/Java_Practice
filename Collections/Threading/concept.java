Multi Threading:
Process :Processes run concurrently:different programs run concurrently
  Ex:when we want to listen music while we are coding then two applications open called concurrently
Threads:parts of a program run concurrently
  Two threas share the same address space while it is less expensive than processes
  Thread is an independent sequential path of execution environment
  Thead can be created by suing two methods:
  1.By implementening the java.lang.RunnableInterface
  2.By Extending the java.lang.ThreadClass
  package Threads;

public class Thread1 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello,i am running   "+i);
        }
    }

    public static void main(String[] args) {
        Thread1 th=new Thread1();
        System.out.println("The main thread is running");
        th.start();
        System.out.println("The main thread is ending");
    }
}
