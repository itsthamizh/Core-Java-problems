package learn.exceptions;

public class UserDefinedException extends Exception {

    private static int accno[]={1001,1002,1003,1004};

    private static String name[]={"nish","subash","kamal","karthi","govind"};

    private static double bal[]={10000.00,12000.00,5600.0,999.0,1100.55};

    UserDefinedException(){

    }

    UserDefinedException (String str){
        super(str);
    }

    public static void main(String args[]){
        try{
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] +
                        "\t" + bal[i]);

                // display own exception if balance < 1000
                if (bal[i] < 1000)
                {
                    UserDefinedException me = new UserDefinedException("Balance is less than 1000");
                    throw me;
                }
            }
        }
        catch (UserDefinedException e){
            e.printStackTrace();
        }
    }
}
