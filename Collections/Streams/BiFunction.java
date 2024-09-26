public class sumTest {
    public static void main(String[] args) {

//when the function retrurn s a value;

        BiFunction<Integer, Integer, Integer> sum1 = Integer::sum;
        Integer sum = sum1.apply(1, 4);
        System.out.println(sum);
//predicate to check the boolean
        BiPredicate<String,String>comp=Object::equals;
        boolean val=comp.test("Kavya","Kavya");
        System.out.println(val);

    }
}
