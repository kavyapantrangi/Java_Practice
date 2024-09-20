Functional Interface means which has only one method
It is also called sam: single abstract method
  The functional interface may also contain default methods, static methods, and methods related to object class which does not require
  a definition.
  ##### How to implement the functional Interface by using the implements keyword#####
  
  
  















  public interface A {
    void show();

}
//It can be implemented by ananoumous inner class
public class hello {

    public static void main(String[] args) {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        obj.show();

    }
}
