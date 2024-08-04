package Strings1;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("kavya"+new ArrayList<>());
        String alpha="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
//            System.out.println(ch);
            alpha+=ch;
        }
        System.out.println(alpha);
        //the problem here is : It takes more time consuming
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
//            System.out.println(ch);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder);
        System.out.println(builder.reverse());
        String name="Amruth kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
