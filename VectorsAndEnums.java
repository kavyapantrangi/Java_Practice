Vector is also extends List Interface and used when multi threading is not accepted.
  package Collections;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[]args)
    {
        List<Integer> vector=new Vector<>();
        vector.add(56);
        vector.add(67);
        vector.add(12);
        vector.add(34);
        vector.add(78);
        System.out.println(vector);


    }
}
//Enum Keyword in java:
it can be used for the unchangeble type
  An enum is a special "class" that represents a group of constants


  package Collections;
//enum can implements the interface also

public class EnumExample {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, friday, saturday, sunday;
        //enum constants
        //public,static and final
        //since its final you can create child enums
        //type is week


        Week() {
            System.out.println("constructor called for   " + this.toString());
        }
        }
  //we do not need to create objects its internally Public static final Week Monday=new week();

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
//        for(Week day:Week.values())
//        {
//            System.out.println(day);
//        }
    }
}
