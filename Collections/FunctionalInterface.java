Functional Interface means which has only one method 
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
