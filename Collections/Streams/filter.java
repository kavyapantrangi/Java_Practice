package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//to process the data from the collections we use streams
public class filter {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("kavya","ramya","sravya","geeta","kalyani");
        //imperative programmming
        for(String name:names)
        {
            if(!name.equals("kavya"))
                System.out.println(name);
        }
        System.out.println("streams");
        //by using functional programming :streams
      names.stream().filter(new Predicate<String>() {
          @Override
          public boolean test(String  name) {
              return !name.equals("kavya");
          }
      }).forEach(name-> System.out.println(name));
        
    }
}
