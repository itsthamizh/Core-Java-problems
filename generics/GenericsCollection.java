package learn.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsCollection {
    public static void main(String args[]){
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(5);
        obj.add(10);
        obj.add(15);

        Integer i = obj.get(1);

        System.out.println("the get value is : "+i);

        Iterator<Integer> it =obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
