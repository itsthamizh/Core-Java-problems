package learn.collections;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Map {
    public static void main (String args[]){
        //....In this below program for to print the elements using key ....//
//        HashMap<Integer,String> hm =new HashMap<>();
//        hm.put(101,"alexa,");
//        hm.put(102,"goole,users");
//        hm.put(103,"flifcart,200");
//        hm.put(104,"gogog,1250");
//        hm.put(105,"uber");
//        hm.put(105,"olabook");
//
//
//
//       //Using iterator to print the key and values
//        Set set = hm.entrySet();
//
//        Iterator i= set.iterator();
//
//        while(i.hasNext()){
//            HashMap.Entry me= (HashMap.Entry) i.next();
//            System.out.println(me.getKey()+" : "+ me.getValue());
//        }
//
//        //To use the for Each loop to print the key and values
//        for(Integer key : hm.keySet()){
//            System.out.println("key = "+ key);
//        }
//        for(String value : hm.values()){
//            System.out.println("Values : "+ value);
//        }






//..... This program for using to print the key value in TreeMap .....//
//        java.util.Map<String,String> map = new TreeMap<>();
//        map.put("siva","apple");
//        map.put("101","banana");
//        map.put("103","orenge");
//        map.put("105","guva");
//        map.put("104","pine-apple");
//
//        for(java.util.Map.Entry<String,String> goal:map.entrySet()){
//            System.out.println(goal.getKey()+" "+goal.getValue());
//        }





//.....This below program for printing the key value in LinkedHashMap ......//
//        java.util.Map<Integer, String> linkedHashMap = new HashMap<>();
//        linkedHashMap.put(101,"apple");
//        linkedHashMap.put(103,"orange");
//        linkedHashMap.put(105,"banana");
//        linkedHashMap.put(102,"guva");
//        linkedHashMap.put(104,"pine-apple");
//        linkedHashMap.put(110,"granate");
//        linkedHashMap.put(108,"pome");
//        linkedHashMap.put(108,"megran");
//
//        for(java.util.Map.Entry<Integer,String> entry: linkedHashMap.entrySet()){
//            System.out.println(entry.getKey()+"  "+entry.getValue());
//        }



    }
}