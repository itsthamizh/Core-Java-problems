package learn.thread.Synchronize;

public class Example1 {
    public static void main(String args[]){
        ID id = new ID();
        ID id1 = new ID();
        System.out.println("thread val"+id.getID());
        System.out.println("thread val"+id1.getID());
//        System.out.println(ID.getID());
    }
}


class ID{
    private static int counter;
    public static synchronized int getID(){
       return counter++;
    }
}