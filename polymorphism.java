// Polymorphism: Having the one entity in different forms
// 2 types of polymorphism 1:Runtime 2:compiletime
// Compile time polymorphism is achieved by method overloading: may have different parameters and arguments
// Run time polymorphism is achieved by method overriding: it must have the same return type and the same number of arguments but action inside it will be different
//Upcasting:
// Parent obj=new child();
// when overriding happens the method is depends on its child called upcasting.
//Early binding vs late binding
//to prevent inheritence we can use  final 
//Binding which can be resolved at compile time by the compiler is known as early binding or static binding
//overiding -->object-->1\static

Animal.java://parent class
package polymorphism.An;

public class Animal {
    void sound()
    {
        System.out.println("heyy there");
    }
// final  void sound()
//    {
//        System.out.println("heyy there");
//    }
}
cat.java//child class
package polymorphism.An;

public class cat extends Animal{
 public   void sound()
   {
       System.out.println("mew mew 🐰🐰🐰");
   }
}
dog.java//child class
  package polymorphism.An;

public class dog extends Animal{
  public   void sound()
    {
        System.out.println("bow boww ");
    }
}
  
