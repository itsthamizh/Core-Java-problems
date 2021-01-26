package learn.collections;

import java.util.*;

public class SetCollection {
    public static void main(String args[]){

//......In this below program to print the elements using HashSet()......//

        HashSet<Object> hashSet = new HashSet();
        hashSet.add("tamil");
        hashSet.add("english");
        hashSet.add("maths");
        hashSet.add("science");
        hashSet.add("maths");

        Iterator i = hashSet.iterator();

        for(Object name : hashSet) {
            System.out.println(i.next());
        }




//.....In this below program for to print the elements using TreeSet() method......//

        TreeSet<Object> treeSet = new TreeSet<Object>();
        treeSet.add("cycle");
        treeSet.add("bike");
        treeSet.add("car");
        treeSet.add("ktm");
        treeSet.add("bus");
        treeSet.add("aeroplane");

        Iterator i1 = treeSet.iterator();

        for(Object values:treeSet){
            System.out.println(i1.next());
        }


//...... In this program for to print the elements using LinkedHashMap()......//

        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        linkedHashSet.add("pulsar");
        linkedHashSet.add("kawasaki");
        linkedHashSet.add("duke");
        linkedHashSet.add("pulsar");
        linkedHashSet.add("apache");

        Iterator i2 = linkedHashSet.iterator();
        for(Object name : linkedHashSet){
            System.out.println(i2.next());
        }



    }
}
