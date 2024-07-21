package Exceptions;

public class Main{
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("hi kavyaa");
        }
    }
    //throws used to declare exceptions
    //throw is used to throw an exception
  static   int divide(int a,int b)
    {
        if(b==0)
        {
            throw  new ArithmeticException("ouch!!");
        }
        return a/b;
    }
}
