package streams;

import java.sql.SQLOutput;

public class sumTest {
    public static void main(String[] args) {
        Isum isum=new Isum() {
            //ananonymous inner class
            @Override
            public int sum(int val1, int val2) {
                return val1+val2;
            }
        };

        System.out.println(" by using anonymous inner class  "+ isum.sum(2,4));

        //by suing java8 features
        Isum Lambdasum=(val1,val2)->
        {
            return val1+val2;
        };
        System.out.println("By suing lambda "+Lambdasum.sum(2,6));
        //by suing method refernece:
        Isum isum2=sumTest::addition;
        System.out.println("By suing Method referenec"+isum2.sum(1,2));
        Isum sum2=Integer::sum;
        System.out.println("The sum is "+sum2.sum(45,45));
    }
    public static int addition(int v1,int v2)
    {
        return v1+v2;
    }


}






public class sumTest {
    public static void main(String[] args) {
        //by using the  instance of the class

Isum sum=new sumTest()::sum2;
        System.out.println("By using the instance of the class ");
        System.out.println(sum.sum(12,67));

    }
    int sum2(int v1,int v2)
    {
        return v1+v2;
    }
}


//another method
public class sumTest {
    public static void main(String[] args) {
        //by using the  instance of the class

Isum sum=sumTest::sum2;
        System.out.println("By using the instance of the class ");
      int v=  sum.sum(new sumTest(),12,45);
        System.out.println("The value is "+v);

    }
    int sum2(int v1,int v2)
    {
        return v1+v2;
    }
}






