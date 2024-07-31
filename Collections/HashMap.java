package collections;

import java.util.HashMap;
import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String,Integer>mpp=new HashMap<>();
        mpp.put("kavya",1);
        mpp.put("kamaskshi",2);
        mpp.put("sravya",2);
        mpp.put("kiana",3);
        mpp.put("Amruth",4);
        mpp.put("ramesh",5);
        System.out.println(mpp);
        System.out.println(mpp.get("kavya"));
        System.out.println(mpp.containsKey("amruth"));
        //for the adjaceny list in graphs we use maps;
        Map<Integer,List<Integer>>adj=new HashMap<>();
        /* 1-2
        3-5
        1-5
        2-3
         */
        //first we have to check whether the entry has the value in map or not
//        if(adj.get(1)==null) {
//            adj.put(1, new ArrayList<>());
//        }
//        adj.get(1).add(2);

        //we can use the another method
        adj.computeIfAbsent(1,f->new ArrayList<>());
        //as we already know that map is not an collection so inorder to travesral we have to convert the map into set
        Set<Map.Entry<String,Integer>>entrySet=mpp.entrySet();
        for(Map.Entry<String ,Integer>st:entrySet)
        {
            System.out.println(st.getKey()+"   "+st.getValue());
        }
        System.out.println(   mpp.keySet());
        Set<String >keysets=mpp.keySet();
        for(String s1:keysets)
        {
            System.out.println(s1);
        }

        }


    }

//Linkedhash Map()--To maintain the certain ordering in the entries we have to use the LinkedHashMap<>();
package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked {
    public static void main(String[] args) {
        Map<String,Integer> mpp=new LinkedHashMap<>();
        mpp.put("kavya",1);
        mpp.put("kamaskshi",2);
        mpp.put("sravya",2);
        mpp.put("kiana",3);
        mpp.put("Amruth",4);
        mpp.put("ramesh",5);
        System.out.println(mpp);
    }
}
//TreeMap
package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Linked {
    public static void main(String[] args) {
        TreeMap<String,Integer> mpp=new TreeMap<>() ;

        mpp.put("kavya",1);
        mpp.put("kamaskshi",2);
        mpp.put("sravya",2);
        mpp.put("kiana",3);
        mpp.put("Amruth",4);
        mpp.put("ramesh",5);
        System.out.println(mpp);
        System.out.println(mpp.get("kavya"));
        System.out.println(mpp.ceilingKey("k"));
        System.out.println(mpp.ceilingEntry("kiana").getValue());
    }
}


