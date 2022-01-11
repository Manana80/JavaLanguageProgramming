package day08_IfStatements;
/* write a program that can swipe two variables 'value by using a temporary variable.
Ex:
            if a = 10 , b = 15

 */
public class SwapTwoVariablesWithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
    // -----------------------------------------------
       // b = a; // b = 10 ( if we do this then the original value of 15 is gone.
        // Hence, we cannot do this because we will have no data to assign to a!).
        //Therefore, we need to create a third value where we can move the values around.

        int c = b; // now c contained the original value of b. c is called a temporary variable.
        b = a;
        a = c;

    // ---------------------------------------------

        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10
    }
}
