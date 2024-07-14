// ENCAPSULATION:wrapping up the implementation by hiding the data vearibles and methods.
//   focus on the hiding the complexity
//     Examples: school bag which hides the books,pens etc in bag
//              bank account by showing only necessary details required to user
// Abstraction: Hiding the unecessary details and showing the valuable info
//             focus on the data security
//    example: social media apps ,which  we login by using username and password which does not know the what internal process is working
// how to acess the private members by using getter and setters
//   protected:subclass can be uses the protected member in different package

//private: s.java
package encapsulation;

public class S {
//    public static void main(String[] args) {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private  int num;
        String name;
        int[]arr;
        public S(int num,String name)
        {
            this.num=num;
            this.name=name;
            this.arr=new int[num];


    }
}
//main class:
package encapsulation;

public class Mai {
    public static void main(String[] args) {
        S s=new S(12,"kavya");
        System.out.println(s.getNum());

    }
}

//protected
case 1: we can acess itr from anywhre in the same class

  package encapsulation;
//we can access the protected members of a class anywhere in it.

A.java
public class A {
    protected int year=2024;
    protected void Year()
    {
        System.out.println(" hey 2024");
    }

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.year);
        a.Year();
    }

}

//case 2:B.java
//Accessing the menmbesrs from the other class of same package
public class B {
    protected  String name="vyshu";
    protected  void  habbit()
    {
        System.out.println(" Reading books");
    }
}

----another class :Main.java
  package encapsulation;
//we can access the protected members of a class anywhere in it.


public class A {
    protected int year=2024;
    protected void Year()
    {
        System.out.println(" hey 2024");
    }

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.year);
        a.Year();
        B b=new B();
        System.out.println(b.name);
        b.habbit();
    }

}

case3:
//Accessing the potected members in the subclass if both were presenr in same package
  package encapsulation;
public class C extends B {//refered to the above class
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.name);
        c.habbit();
    }
}
case 4:
  //Accessing the protected members from different subclass of different package
  package inheritance;
import  encapsulation.B;


public class enca extends B{
    int num;
    public enca()
    {

    }


    public enca(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        enca e=new enca(12);
//        enca e1=new enca();
        System.out.println(e.name);
        e.habbit();
        System.out.println(e.num);

    }
}
note: we cannot access the parentclass proteted members  by creating the parent class as an reference object



