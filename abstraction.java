abstract class contains only method definition and implementation must be done in child class
  if a class contains two or more abstract methods it must be declare as  abstract
  we cannot create objects for abstract class
  we cannot create abstract static methods,constructors in a abstract class
  //parentclass-->parent.java
ackage abstraction;

public abstract class parent {
    static  void hello()
    {
        System.out.println("heloo ");
    }
    void hellor()
    {
        System.out.println(" hellor kavyaaa");
    }
    abstract void career(String name);
    abstract  void studies(String subje,int age);
//child class-->child.java
package abstraction;

public class child extends parent {
    void career(String name)
    {
        System.out.println("My name is kavya");
    }
@Override
void studies(String subje,int age)
{
    System.out.println("The subject is "+subje+"and age is"+age);
}
}

//main class: main.java
package abstraction;

public class main {
    public static void main(String[] args) {
        child ch=new child();
        ch.studies("java",23);
        ch.career("Java Developer");
        parent.hello();
        ch.hellor();

    }
}

