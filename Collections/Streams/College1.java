package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class College {
    private String branch;
    private int rollno;
    private String name;
    private int rank;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "College{" +
                "branch='" + branch + '\'' +
                ", rollno=" + rollno +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public College(String branch, int rollno, String name, int rank)
    {
        this.branch=branch;
        this.rollno=rollno;
        this.name=name;
        this.rank=rank;

    }

    public static void main(String[] args) {
        List<College> students=new ArrayList<>();
        students.add(new College("CSE", 506, "Kavya", 4));
        students.add(new College("ECE", 407, "Rahul", 3));
        students.add(new College("EEE", 208, "Arjun", 2));
        students.add(new College("Mechanical", 309, "Meera", 1));
        students.add(new College("Civil", 110, "Priya", 4));
        students.add(new College("CSE", 511, "Ravi", 3));
        students.add(new College("ECE", 412, "Anjali", 2));
        students.add(new College("EEE", 213, "Vikram", 1));
        students.add(new College("Mechanical", 314, "Sanjay", 4));
        students.add(new College("Civil", 115, "Neha", 3));
        students.add(new College("CSE", 516, "Akash", 2));
        students.add(new College("ECE", 417, "Anil", 1));
        students.add(new College("EEE", 218, "Ajay", 4));
        students.add(new College("Mechanical", 319, "Tara", 3));
        students.add(new College("Civil", 120, "Rohit", 2));
        students.add(new College("CSE", 521, "Sneha", 1));
        students.add(new College("ECE", 422, "Vikas", 4));
        students.add(new College("EEE", 223, "Rina", 3));
        students.add(new College("Mechanical", 324, "Kiran", 2));
        students.add(new College("Civil", 125, "Arya", 1));



//        List<College>CseList=students.stream().filter(i->i.branch=="CSE").collect(Collectors.toList());
//        System.out.println(CseList);
        List<College>CseList=students.stream().filter(i->i.branch=="CSE").sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(2).collect(Collectors.toList());
        System.out.println("cse Top rankes");
        CseList.forEach(i->
        {
            System.out.println(i.getName()+"  "+i.getRank()+" "+i.getBranch());
        });
        //For Ece students
        System.out.println("ECE Top rankes");
        students.stream().filter(i->i.branch=="ECE").sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(2).forEach(i->
                System.out.println(i.getName()+"  "+i.getRank()+" "+i.getBranch()) );
        //for eee students
        System.out.println("EEE Top rankes");
        students.stream().filter(i->i.branch=="EEE").sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(2).forEach(i->
                System.out.println(i.getName()+"  "+i.getRank()+" "+i.getBranch()) );

    //for mechanical
    System.out.println(" Top rankes");
        students.stream().filter(i->i.branch=="Mechanical").sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(2).forEach(i->
            System.out.println(i.getName()+"  "+i.getRank()+" "+i.getBranch()) );
//for civil
        System.out.println("  Civil Top rankes");
        students.stream().filter(i->i.branch=="Civil").sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(2).forEach(i->
                System.out.println(i.getName()+"  "+i.getRank()+" "+i.getBranch()) );
}

}
