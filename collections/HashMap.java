package learn.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap implements MapCollection{

    java.util.HashMap<Integer,String> hashMap= new java.util.HashMap<Integer, String>();

    public void setHashMap(java.util.HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
        hashMap.put(101,"tamil");
        hashMap.put(102,"english");
        hashMap.put(103,"maths");
        hashMap.put(104,"science");
        hashMap.put(105,"social");
    }
    public void getHashMap(java.util.HashMap<Integer,String> hashMap){
        this.hashMap=hashMap;
    }

    public void display() {
        this.hashMap=hashMap;
        Set set = hashMap.entrySet();
        Iterator i = set.iterator();

        for(java.util.HashMap.Entry<Integer,String>entry:hashMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

}