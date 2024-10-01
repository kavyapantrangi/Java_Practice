package streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Test5 {
    public static void main(String[] args) {
        List<String> names=List.of("harini","Nikhita","Abilash","kiara","kalix");
        names.stream().map(Employee
        ::new).map(employee ->
        {
           employee.setId( ThreadLocalRandom.current().nextInt(1,100));
            return employee;
        }).map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
    }
}
