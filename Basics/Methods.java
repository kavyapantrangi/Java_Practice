Method:It is a collection of instructions that perform a specific task.
  To achieve the reusability of the code.
  Example:
package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        sum();
      sum();
      sum();

    }
    static void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1=sc.nextInt();
        System.out.println("Enter number 2");
        int n2=sc.nextInt();
        System.out.println("the sum is "+(n1+n2));

    }
}

//Function or method looks like:
Return_type Function_name (arguments)
  {
  //body
return statements
  }
//The return arguments
package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        System.out.println(sum1());

    }

    static int sum1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1=sc.nextInt();
        System.out.println("Enter number 2");
        int n2=sc.nextInt();

        return n1+n2;

    }
}
//By using the arguments
public class Methods {
    public static void main(String[] args) {

        System.out.println(sum1(6,8));

    }
    static int sum1(int a,int b)
    {
        return a+b;
    }

}

//Shadowing 
The overriding the value of the existing variable 
public class Methods {
   static int a=10;
    public static void main(String[] args) {

        {
          int  a=20;
            System.out.println(a);
        }
        System.out.println(a);
        pro();



    }
    static void   pro()

    {
        int a=50;
        System.out.println(a);
    }


//Method Overloading
  package basics;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        //method overloading
        System.out.println(   sum(1,2));
        System.out.println(sum("kavya"));
        System.out.println(sum(2,3,4));

    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static String sum(String s)
    {
        return "Hello "+s;
    }




  /when we dont know the number o arguments
  public static void hellor(String...v)
    {
        System.out.println(Arrays.toString(v));

    }





