Sets:
Methods:
-->a.containsAll(b)//subset
-->a.removeAll(b)//difference
-->a.addAll(b)//union 
-->a.retainAll(b)//intersection
-->a.clear()//(emptyset)
package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//
public class set {
    public static void main(String[] args) {

        Set<Integer>setExample=new HashSet<>();
        setExample.add(3);
        setExample.add(37);
        setExample.add(377);
        setExample.add(90);
        setExample.add(378);
        System.out.println(setExample);
        System.out.println(setExample.contains(3));
      /how  a own custom class can be inserted into a set
        List<Students> list = new ArrayList<>();
        list.add(new Students(39, 56));
        list.add(new Students(67, 67));
        list.add(new Students(78, 80));
        list.add(new Students(45, 59));
        list.add(new Students(90, 69));

        Set<Students>st1=new HashSet<>(list);
        //checking the student class details is presented in set or not
        System.out.println(st1);
        System.out.println(st1.contains(new Students(67, 67)));
        //it will give the false although it is present in the set

    }
}

whenever we passing the values by using the new keyword it will create the two different memory locations
  so thats why when the values already present in the set ,it giving the false because it gives the refernce two different memory loactions
  1--- set has different memory location
  2--the checking value which  is --st1.contains(new Students(67, 67)) --hs different location
    so for this case alwys override hashcode() and equals() method in the class then it will give the true
    
package collections;

import java.util.Objects;

public class Students implements Comparable<Students>{
    private int maths;
    private int  physics;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return getMaths() == students.getMaths() && getPhysics() == students.getPhysics();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaths(), getPhysics());
    }

    public Students(int maths, int physics) {
        this.maths=maths;
        this.physics=physics;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getPhysics() {
        return physics;
    }

    public int getMaths() {
        return maths;
    }

    @Override
    public String toString() {
        return "Students{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(Students o) {
//       if(this.maths<o.maths)
//           return -1;
//       if(this.maths>o.maths)
//           return 1;
//       if(this.maths==o.maths)
//           return 0;
        System.out.println("Comparable called");
       return this.maths-o.maths;

    }


//    public int compareTo(Object o) {
//        return 0;
//    }
}
Sorted Set--The sorted set interface extends the set interface to handle the sorted sets.
NavigableSet Interface:
  It contains the methods of ---E pollFirst()   //closest matches:--1.E ceiling(E e) 2.E floor(E e) 3.E higher(E e) 4.E lower(E e)
    
                             ---E pollLast()
    Treeset prints the elements in the sorted manner
    package collections;

import java.util.TreeSet;
import java.util.*;

public class tree {
    public static void main(String[] args) {
        NavigableSet<Integer>set=new TreeSet<>();
        set.add(7);
        set.add(9);
        set.add(79);
        set.add(5);
        set.add(1);
        set.add(78);
        set.add(0);
        System.out.println(set);
        //tree set prints the elements in the sorted order
        NavigableSet<Students>set1=new TreeSet<>();

        set1.add(new Students(34,78));
        set1.add(new Students(78,89));
        set1.add(new Students(67,67));
        set1.add(new Students(39,78));
        set1.add(new Students(54,90));
        set1.add(new Students(65,45));

        System.out.println(set1);
        System.out.println(set.ceiling(5));
        System.out.println(set.floor(7));
        System.out.println(set.higher(9));
        System.out.println(set.lower(56));

    }
}






  
