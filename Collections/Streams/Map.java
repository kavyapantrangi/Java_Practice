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
