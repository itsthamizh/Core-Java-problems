package learn.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericsUsingMap {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<Integer, String >();
        map.put(1,"tamil");
        map.put(2,"english");
        map.put(3,"hindhi");

        Set<Map.Entry<Integer,String>> set = map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry e =itr.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
