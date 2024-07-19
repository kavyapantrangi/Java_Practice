package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[]data;
    private int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList()
    {
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num)
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
        int []temp=new int[data.length*2];
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove()
    {
        int removed=data[--size];
        return removed;

    }
    public int get(int index)
    {
        return data[index];
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
        CustomArrayList list=new CustomArrayList();
        list.add(6);
        list.add(7);
        list.add(14);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size);
        list.set(0,56);
        System.out.println(list.get(0));



    }
}
