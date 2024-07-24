Lists are the collections that maintain their elements in order and can contain duplicates
The elements in a list are ordered
Each element is based on the index.

  List  is an interaface and contain all the methods.
                  E get(int index)
                  E set(int index,element)
                  void add(int index,E element)
                  boolean addAll(int index,Collection<?extends E>C)
                  E remove(int index)
  These all methods are implemented by using three 
  1.ArrayList 2.LinkedList 3.Vector
  //List<T>list=new ArrayList<>();
  here T is reference type only so for every primitive type there exists a reference type
      int-Integer
     double-Double
     float-Float
     char-Character

  //generic List Iterator:
 package collections;

import java.util.Iterator;

public class GenericList<T>implements Iterable<T> {
    private T[]items;
    private int size;

    public GenericList() {
        size=0;
        items=(T[])new Object[100];
    }
    public void add(T item)
    {
        items[size++]=item;
    }
    public void getSize()
    {
        System.out.print(size);
    }
    public T getItemAtIndex(int index)
    {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new genericlistIterator(this);

    }
    private class genericlistIterator implements Iterator<T>
    {
private GenericList<T>list;
private int index=0;
public genericlistIterator(GenericList<T>list)
{
    this.list=list;
}
        @Override
        public boolean hasNext() {
            return index<list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }


}
ArrayList 
  package collections;
import java.lang.reflect.Array;
import java.util.*;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        List<Integer>alist=new ArrayList<>();
        List<Character>aalist=new ArrayList<>();
        alist.add(1);
        alist.add(10);
        alist.add(12);
        alist.add(13);
        alist.add(14);
        alist.add(16);

        System.out.println(alist);
        System.out.println("CHANGING THE ELEMENTS");
        System.out.println( alist.set(1,45));//actually it return the which element got replace
        // we can also the list to another list as an argument
        List<Integer>list2=new ArrayList<>(alist);
        System.out.println(list2);
        list2.addAll(alist);
        System.out.println(list2);
        System.out.println(list2.indexOf(45));
        System.out.println(list2.lastIndexOf(45));
        List<Integer>list3=list2.subList(1,5);
        System.out.println(list3);


    }

}

  
