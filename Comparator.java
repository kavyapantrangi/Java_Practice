package comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;
    public Student(int rollno,float marks)
    {
        this.marks=marks;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Student kavya=new Student(12,87.78f);
        Student Jhnasi=new Student(17,98.78f);
        if(kavya.compareTo(Jhnasi)<0)
        {
            System.out.println("Jhansi ha more marks");
            System.out.println(kavya.compareTo(Jhnasi));
        }
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);
        //if diff==0 means both are equal
        //if diff<0;means this o is bigger
        return diff;
    }
}
