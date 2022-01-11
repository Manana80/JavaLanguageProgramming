package day08_IfStatements;

public class FalseAndTrue {
    public static void main(String[] args) {
        System.out.println(true == !false); // true
        System.out.println(!true != false); // false
        //                 false doesn't equal to false is false.
        System.out.println(!false == true); // true
        System.out.println( !!false);     // false
        System.out.println(!!!true);        //false



    }
}
