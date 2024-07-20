package comparing;
//lambda functions are onle line functions

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
//int[]arr={1,2,3,4};
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            arr.add(i+1);
        }
        arr.forEach((item)->
            System.out.println(item*2));
        System.out.println("By using Consumner ");
        Consumer<Integer>fun=(item)-> System.out.println(item*3);
        arr.forEach(fun);
    }

    int sum(int a,int b)
    {
        return a+b;
    }


}
