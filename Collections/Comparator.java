compare-Comparable interface-compare two objects
  compareTo-Comperator interface- compare one  object
  The Comparable interface has compareTo(T obj) method which is used by sorting methods
  Comparator provides the two way of sorting
  package collections;

import java.util.Comparator;

public class CusomComperator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        return o2-o1;
    }
}
