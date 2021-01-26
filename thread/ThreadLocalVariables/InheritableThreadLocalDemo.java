package learn.thread.ThreadLocalVariables;

public class InheritableThreadLocalDemo {

    public static final InheritableThreadLocal<Integer> intVal= new InheritableThreadLocal<Integer>();

        public static void main (String args[]){

            Runnable rp = () ->{
                intVal.set(10);

                Runnable rc = () ->{
                    Thread t1 = Thread.currentThread();
                    String name = t1.getName();
                    System.out.println(name+" "+intVal.get());
                };

             Thread childThread = new Thread(rc);
             childThread.setName("child-Thread");
             childThread.start();
            };

            Thread paratThread = new Thread(rp);
            paratThread.start();
        }
}
