package Practice;

public class Circle {
    private double radius ;
    private String color ;

    Circle() {
        radius=1;
        color="red";

    }

    Circle(double r) {
        this.radius = r;
    }

    public void  getRadius() {
        System.out.println("radius is" + radius);
    }
    public void getArea(double r)
    {
        System.out.println("the Area of circle is"+3.14*r*r);
    }

    public static void main(String[] args) {
        Circle c=new Circle();
//        c.getArea(2.9);
        System.out.println(c);
        c.getRadius();
    }


}
