
List<Iterator> extends the iterator interface and 
It contains the following methods
boolean hasNext()
boolean  has previous()
E next()//element after the cursor
E previous ()//element previous the cursor
It provides two methods
ListIterator <E>listIterator()
ListIterator <E>listIterator(int index)
When we are using doublly linkedlist it will be useful,for ArrayList it does not


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        ListIterator<Integer>it=list.listIterator();
        System.out.println(it.next());
        System.out.print(it.previous());
    }
}
