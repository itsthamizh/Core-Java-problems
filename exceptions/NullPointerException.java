package learn.exceptions;

public class NullPointerException extends Throwable {
    public static void main(String args[]){
        try{
            String a =null;
            System.out.println(a.charAt(0));
        }
        catch(java.lang.NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }
}
