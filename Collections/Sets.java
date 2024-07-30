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






  
