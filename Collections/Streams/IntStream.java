Auto unboxing:
  Converting the Object of Integer or any into primitive type is called Auto Unboxing

  //Intstream,DoubleStream
  public class intstream {
    public static void main(String[] args) {
        IntStream intstr=IntStream.of(1,2,3,4,5);
        intstr.forEach(System.out::println);
        //for double values
        DoubleStream doublestr=DoubleStream.of(12.3,4,5,6);
        doublestr.forEach(System.out::println);
    }
}
