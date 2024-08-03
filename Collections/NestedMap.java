package collections;

import java.util.HashMap;
import java.util.*;
public class NestedMap {
    public static void main(String[] args) {

        Map<String,Map<String,String>>map=new HashMap<>();
        Map<String,String>inn=new HashMap<>();
        inn.put("Kavya","Nellore");
        inn.put("Mamatha","Noida");
        map.put("jntu",inn);
        System.out.println(map);
        //adding an element in the nested map
        map.get("jntu").put("lavanya","vizag");
        System.out.println(map);
        //removing an elemnt in nested map
        map.get("jntu").remove("lavanya");
        System.out.println(map);
    }
}
