Method:It is a collection of instructions that perform a specific task.
  To achieve the reusability of the code.
  Example:
package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
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
