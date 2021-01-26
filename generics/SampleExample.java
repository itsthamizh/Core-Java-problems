package learn.generics;

public class SampleExample {
    public static void main(String args[]){
        //This for creating a generics objects, this objects are in any type of objects //
        //In this for below is Integer type of objects //
        Test<Integer> integer = new Test<>(3);
        System.out.println(integer.printMethod());

        //This for String type of objects //
        Test<String> string = new Test<>("HelloWorld");
        System.out.println(string.printMethod());
    }
}

//Generics data type must be inside of < > this symbol //
class Test<T>{
    //Declare a variable //
    T value;
    //Create a constructor for getting value//
    Test(T getIn){
        this.value = getIn;
    }
    public T printMethod(){
        return value;
    }
}
