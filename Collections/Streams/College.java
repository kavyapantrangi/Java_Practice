import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class College  {
    private String name;

    public int getRank() {
        return rank;
    }

    private int rank;
    College(String name,int rank)
    {
        this.name=name;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", rank=" + rank
                ;
    }

    public static void main(String[] args) {
        List<College> CSE= new ArrayList<>();
        //for cse students
        CSE.add(new College("kavya",3));
        CSE.add(new College("lakshmi",4));
        CSE.add(new College("vyshu",1));
        CSE.add(new College("deepika",2));
        CSE.add(new College("kalix",5));
        List<College> Ece= new ArrayList<>();
        //for ECE students
        Ece.add(new College("Anil",1));
        Ece.add(new College("Chetana",4));
        Ece.add(new College("luna",5));
        Ece.add(new College("Manasa",3));
        Ece.add(new College("balu",2));
        List<College> Eee= new ArrayList<>();
        //for cse students
        Eee.add(new College("Mamatha",4));
        Eee.add(new College("vidya",3));
        Eee.add(new College("keerthi",2));
        Eee.add(new College("lavanya",1));
        Eee.add(new College("mahesh",5));

        List<College> Mech= new ArrayList<>();
        //for cse students
        Mech.add(new College("kiana",3));
        Mech.add(new College("tharun",2));
        Mech.add(new College("harish",4));
        Mech.add(new College("lisa",1));
        Mech.add(new College("lalitha",5));
        List<College> Civil= new ArrayList<>();
        //for cse students
        Civil.add(new College("pallavi",3));
        Civil.add(new College("pujitha",2));
        Civil.add(new College("geetha",1));
        Civil.add(new College("seetha",4));
        Civil.add(new College("varun",5));

//for cse students
        System.out.println("Top 3 students of CSE");
List<College>cseStudents=CSE.stream().

        sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(3).collect(Collectors.toList());
cseStudents.forEach(i->
        {
            System.out.print("                 ");
            System.out.println(i);
        });
        System.out.println("Top 3 students of ECE");

//for ece students
    List<College>EceStudents=Ece.stream().


            sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(3).collect(Collectors.toList());
EceStudents.forEach(i->
{
    System.out.print("                 ");
    System.out.println(i);
});
//for EEE students
        System.out.println("Top 3 students of EEE");
        List<College>EeeStudents=Eee.stream().


                sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(3).collect(Collectors.toList());
        EeeStudents.forEach(i->
        {
            System.out.print("                 ");
            System.out.println(i);
        });
//for mech
        System.out.println("Top 3 students of mech");
        List<College>MechStudents=Mech.stream().


                sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(3).collect(Collectors.toList());
        MechStudents.forEach(i->
        {
            System.out.print("                 ");
            System.out.println(i);
        });

        System.out.println("Top 3 students of civil");
//for civil students
        List<College>CivilStudents=Civil.stream().


                sorted((e1,e2)->(Integer.compare(e1.getRank(), e2.getRank()))).limit(3).collect(Collectors.toList());
        CivilStudents.forEach(i->
        {
            System.out.print("                 ");
            System.out.println(i);
        });

    }



}
