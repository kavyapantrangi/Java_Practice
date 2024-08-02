String Pool :Memory Structure inside the Heap 
  Immutability:for security reasons strings are immutable
  package Strings1;

public class Main {
    public static void main(String[] args) {
        String a="kavya";
        String b="kavya";
        System.out.println(a);
        //we are not changing the object value
        // here creating an another object
        //the variable is pointing to another object
//        a="amruth";
//        System.out.println(a);
        //comparision of strings
        //== comaparator-- checks the reference variables are pointing to the same object
        //creation of two objects of same value
        String s1=new String("kavya");
        String s2=new String("kavya");
        System.out.println(s1==s2);
        System.out.println(a==b);

    }
}
