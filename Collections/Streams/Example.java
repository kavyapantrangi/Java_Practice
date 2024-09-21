import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Branch{
    String name;
    int ranking;
    Branch(String name,int ranking)
    {
        this.name=name;
        this.ranking=ranking;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    public static void main(String[]args)
    {
       List<Branch>branch=new ArrayList<>();
       branch.add(new Branch("majnu",1));
        branch.add(new Branch("local",2));
        branch.add(new Branch("singam",3));
        branch.add(new Branch("joe",4));
        branch.add(new Branch("jersy",5));
        for(Branch val:branch)
        {
            System.out.println(val.name+" "+val.ranking);
        }

//by using stream class
        Stream<Branch>br=branch.stream();
        br.forEach(val-> System.out.println(val));

    }
}
