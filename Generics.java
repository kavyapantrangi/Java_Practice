<T> is the template for all type of objects
The Generics are used for the tighter type check at compile time and actual object creation done at runtime,
cannot create the instance of a type parameter.
package Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[]data;
    private int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList()
    {
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull() {
       return size==data.length;

    }
    public void resize()
    {
        Object[]temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove()
    {
        T removed=(T)data[--size];
        return removed;

    }
    public T get(int index)
    {
        return (T)data[index];
    }
    public int size()
    {
        return size;
    }
    public void set(int index,int value)
    {
        data[index]=value;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }



    public static void main(String[] args) {
//        CustomArrayList list=new CustomArrayList();
//        list.add(6);
//        list.add(7);
//        list.add(14);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size);
//        list.set(0,56);
//        System.out.println(list.get(0));
        CustomArrayList<String>str=new CustomArrayList<>();
        str.add("kavya");
        str.add("pallavi");
        System.out.println(str);


    }
}
//WIldcard Entries
? can be known as wildcard in generic programmng
The wildcard can be used in a variety of  situaction such as type parameter,field,local variable
UpperBound Wiuldcard Entries
    when you want to restrict the type in   an arrayList then wildcard entries useful
    suppose <T exteds Number>means it can only accepts the Number Type and whnever we want use the types of Integer,DOuble  we will use syntax as
    public void getList(<List<?extends Number>list)
    package Generics;

import java.util.Arrays;
import java.util.*;

public class Wildcard<T extends Number> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public Wildcard() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;

    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;

    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;

    }

    @Override
    public String toString() {
        return "wildcard{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
//        CustomArrayList list=new CustomArrayList();
//        list.add(6);
//        list.add(7);
//        list.add(14);
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.size);
//        list.set(0,56);
//        System.out.println(list.get(0));
        Wildcard<Integer> str = new Wildcard<>();
        str.add(1);
        str.add(2);
        System.out.println(str);
        Wildcard<Double>wild=new Wildcard<>();
        for(int i=0;i<5;i++)
        {
            wild.add(5.5*i);
        }
        System.out.println(wild);

    }
}






    


