package streams;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Supplier<String>supplier=new Supplier<String>() {
            @Override
            public String get() {
                return "Hlo kavya ji";
            }
        };
        Stream<String>streamOfStrings=Stream.generate(supplier);
        Consumer<String>consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Printing  "+s);
            }
        };
//              /**/  streamOfStrings.forEach(consumer);
    


    }
}
