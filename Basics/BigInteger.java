package basics;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        int a=20;
        int b=65;
        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(389505845);
        BigInteger s=A.add(B);
        System.out.println(s);
        //factorial
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int  num=sc.nextInt();
        BigInteger ans=new BigInteger("1");
        for(int i=2;i<=num;i++)
        {
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }

}
