package learn.collections;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class arrayList {
    public static void main(String args[]){

        ArrayList arrayList= new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        System.out.println(arrayList);
        arrayList.add(3,"hi");
        arrayList.add(3,"hello");


        Iterator i = arrayList.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("\nThis is for print the arraylist using ForEach Loop :");
        for(Object names : arrayList){
            System.out.println(names);
        }



   //.... This code for to access the another class elements....//
//        Student student_1 = new Student(101,"alex", 55.0);
//        Student student_2 = new Student(102,"balaji", 45.0);
//        Student student_3 = new Student(103,"Colton", 78.0);
//        Student student_4 = new Student(104,"ganapathy", 91.0);
//        Student student_5 = new Student(104,"Govinda", 85.0);
//
//        ArrayList<Object> arrayList = new ArrayList();
//        arrayList.add(student_1);
//        arrayList.add(student_2);
//        arrayList.add(student_3);
//        arrayList.add(student_4);
//        arrayList.add(student_5);
//
//        //Using iterator to print the values
//        Iterator i= arrayList.iterator();
//
//        while(i.hasNext()){
//            Student com=(Student) i.next();
//            System.out.println(com.RollNum+" "+com.name+" "+com.marks);
//        }
//


//... This for adding and removing the elements in ArrayLists...//
//        ArrayList First= new ArrayList<>();
//        First.add("keile");
//        First.add("khogio");
//        First.add("trahonea");
//        First.add("chellappa");
//
//        ArrayList Second = new ArrayList<>();
//        Second.add(101);
//        Second.add(102);
//        Second.add(103);
//
//        First.addAll(Second);
//        //Second.addAll(First);
//
//        Iterator i= First.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        First.removeAll(Second);
//        //First.removeAll(Second);
//
//        System.out.println("\nThis for next print Ststement :");
//
//        Iterator ii= First.iterator();
//        while(ii.hasNext()){
//            System.out.println(ii.next());
//        }




    //....This for to Print the common of the elements in both ArrayLists using retain method....//
//        ArrayList<String> name1= new ArrayList<>();
//        name1.add("apple");
//        name1.add("banana");
//        name1.add("Orange");
//        name1.add("pine-apple");
//
//        ArrayList<String> name2=new ArrayList<>();
//        name2.add("apple");
//        name2.add("guva");
//        name2.add("Orange");
//        name2.add("green-apple");
//
//        ArrayList<String> name3=new ArrayList<>();
//        name3.add("apple");
//        name3.add("guva");
//
//        name2.retainAll(name1 );
//
//        Iterator i =name2.iterator();
//
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }








    }
}

class Student{
    int RollNum;
    String name;
    Double marks;

    Student(int Roll_Num, String Names, Double maarks){
        this.RollNum= Roll_Num;
        this.name= Names;
        this.marks= maarks;
    }
}