package learn.thread.Synchronize;

//class Synchmethod {
//    public void calculate(int val) {
//        System.out.println(Thread.currentThread().getName() + " is in calculate mathod ");
//        System.out.println("This for add :" + (val + val));
//        System.out.println("This for sub :" + (val - val));
//        System.out.println("This for mul :" + (val * val));
//        System.out.println("This for div :" + (val / val));
//
//    }
//}


class SyncMethodTable{
    public synchronized void displayTable(int val)throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" i am going to print table ");
        for(int i=1;i<5;i++){
            System.out.println(val +"*"+i+" = "+val*i);
            Thread.sleep(1000);
        }
        System.out.println("I have finished printing the table");
    }
    public void calculate(int val) {
        System.out.println(Thread.currentThread().getName() + " is in calculate mathod ");
        System.out.println("This for add :" + (val + val));
        System.out.println("This for sub :" + (val - val));
        System.out.println("This for mul :" + (val * val));
        System.out.println("This for div :" + (val / val));

    }
}

class SynchMethodThread1 extends Thread{
    SyncMethodTable table;
    public SynchMethodThread1(SyncMethodTable table){
        this.table=table;
    }
    @Override
    public void run() {
        try {
            table.displayTable(2);
            table.calculate(2);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class SynchMethodThread2 extends Thread{
    SyncMethodTable table;
    SynchMethodThread2(SyncMethodTable table){
        this.table=table;
    }
    @Override
    public void run() {
        try {
            table.displayTable(3);
            table.calculate(3);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}


public class SynchronizeExample {
    public static void main(String args[]){
        SyncMethodTable table = new SyncMethodTable();
        SynchMethodThread1 thread1 = new SynchMethodThread1(table);
        SynchMethodThread2 thread2 = new SynchMethodThread2(table);
        thread1.setName("First Thread");
        thread2.setName("Second Thread");
        thread1.start();
        thread2.start();
    }
}
