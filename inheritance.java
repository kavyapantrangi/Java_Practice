package inheritance;
//child class which extends the properties of the base class

public class Boxweight extends  Box{
    double weight;


//    Boxweight box1=new Boxweight();
    public Boxweight()
    {
        this.weight=-1;
    }

    public Boxweight(int l, int h, int w, double weight) {
        //what is super class :call the parent class constructor
        //used to intialize the values in the parent class
        super(l, h, w);
        this.weight = weight;
    }
}
//child-child
//parent -child
--------parent class:
package inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box()
    {
this.h=-1;
this.l=-1;
this.w=-1;
    }
    Box(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(int l,int h,int w)
    {
        this.l=l;
        this.h=h;
        this.w=w;


    }
    Box(Box old)
    {
        this.h= old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information()
    {
        System.out.println(" Runnib box");
    }
}

---main class:
ackage inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(1,2,3);
//        Box box=new Box();
//        Box box=new Box(1);
        Boxweight box=new Boxweight(1,2,3,4.0);

        System.out.println(box.l+" "+box.h+" "+box.w+" "+box.weight);
    }

}


