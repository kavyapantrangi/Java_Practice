

human.java
package Cloning;
//object cloning is that copying the same elements
//non primitives will be pointed and primitives will be copied
public class Human implements Cloneable
{
    int age;
    String name;
    public Human(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

//main
package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h=new Human(21,"kavya");
        Human k=(Human)h.clone();
        System.out.println(k.age);
        System.out.println(k.name);

    }
}
object cloning will be copying the exact object values to another with object.clone method if does not create then will 
    throw clonenotfoundException.by using new keyword wecan create but it will take a lot of time to process. 
