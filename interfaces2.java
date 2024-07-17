Interfaces can extend from one interface to another interface
//Static method in the interface should have the body
//it can be called by classname
Interface A:
package Interfaces.extendDemo;

public interface A {
    void fun();
}

//Interface B
package Interfaces.extendDemo;

public interface B extends A{
    void greet();
}
//class implemenatation
package Interfaces.extendDemo;

public class ex implements B{
    @Override
    public void fun() {
        System.out.println("Hello welcome to Ainterface");
    }

    @Override
    public void greet() {
        System.out.println("Helloe Elcome to B interface");

    }

    public static void main(String[] args) {
        ex e=new ex();
        e.fun();
//        e.fun();
        e.greet();
    }
}
//NestedInterface:Inside  a class 
package Interfaces.Nested;

public class A {
    //nested interface
    public interface NestedInterface
    {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface
{

    @Override
    public boolean isOdd(int num) {
        return (num%2==1);
    }

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.isOdd(2));
    }
}
