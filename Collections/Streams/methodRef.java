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

//STring Concation
package streams;

import java.util.function.BiFunction;

public class Test2 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        BiFunction<String,String,String>concat=String::concat;
        String ans= concat.apply("Kavya","Pantrangi");
        System.out.println(ans);
    }
}


package streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Bi {
    public static void main(String[] args) {
        //to convert into uppercase
        //the following method is used for a particular string only
        String a="Hello";
        Supplier<String>str =a::toUpperCase;
        System.out.println(str.get());
        //we apply it instantly
        Function<String,String>input=String::toUpperCase;
        System.out.println(input.apply("kavyaa"));
        System.out.println(input.apply("kalix..."));

//how to use printstream which will accepts two paramenters and return
       BiConsumer <PrintStream,String>consumetr= PrintStream::println;
        consumetr.accept(new PrintStream(System.out),"kavyaaa");
        consumetr.accept(new PrintStream(System.out),"Ramesh");
        consumetr.accept(new PrintStream(System.out),"Luna valeria");

/
        
    }
}



