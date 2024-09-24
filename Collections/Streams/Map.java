package streams;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(2,5,7,6,8,9);
        //map is used to form the data from one form to another form
        list.stream().filter(i->i>5).map(i->i*2).forEach(i-> System.out.println(i));
        list.stream().filter(i->i<6).map(i->
        {
            return "hello   " +i;
        }).forEach(i-> System.out.println(i));
    }
}

: Intermediate Operation always returns a stream
    //terminal operations:foreach,collct


    //collect
    package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(2,5,7,6,8,9);
     
        Stream<Integer>li=list.stream().filter(i->i>4);
        List<Integer>collect=li.collect(Collectors.toList());
        System.out.println(collect);


    }
}
//using count
public class Map {
    public static void main(String[] args) {



        List<Integer> list= Arrays.asList(2,5,7,6,8,9);

        Stream<Integer>li=list.stream().filter(i->i>4);


        //using count
       long count=li.count();
        System.out.println( "total count is "+count);
