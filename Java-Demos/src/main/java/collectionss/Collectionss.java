package collectionss;

import java.util.*;

public class Collectionss {

    //Collection
    //List-Arraylist-->ordered,duplicates
    //Set-hashset-->unordered,no duplicates
    //Map-hashmap-->ordered,key value pair

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);

        System.out.println(list.get(2));//retrieve the  third element
        System.out.println(map.get(3));//retrieve the  third element
    }
}
