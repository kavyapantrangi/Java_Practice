import java.util.Arrays;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,7,8,3,4,5);
        //converstion of list to stream
        list.stream().sorted().forEach(i-> System.out.println(i));
    }
}
