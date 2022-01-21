package day41_Exceptions;

public class TryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Test started");

        // This is how we handle an unchecked exceptions , by using try and catch block

        try {
            System.out.println(9/0); // if it is an exception try block won't be executed and it will jump to catch block
            System.out.println("Try Block");
        } catch (ArithmeticException e) { // e represents the exception type variable name
            // it is very important to use the right class in the catch block
            System.out.println( "Catch Block");
            System.out.println("Arithmetic Exception occurred");
        }

        System.out.println("Test completed");


        System.out.println("------------------------------------------------------------------");
        System.out.println("Test 2 started");

        try{ int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[200]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            /*
            if we put in the argument (Null Pointer Exception e) we will still get an excption since we chose the wrong Exception
             */
           // e.printStackTrace(); // preferred method to be placed in the catch block to get the full details about the exception
            System.out.println(e.getMessage()); // gives a brief message about the exception.
        }

        System.out.println("Test 2 completed");

/*
if we don't know what type of exception we have to choose, then just put the name of parent class of them all that is the runTimeException
since it can handle all the child classes exceptions.
 */

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Test 3 started");

        try{
            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test 3 completed");

        System.out.println("---------------------------------------------------------------------");










    }
}
