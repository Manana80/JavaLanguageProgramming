package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        } catch (RuntimeException e) {
            System.out.println("Catch Block");
            e.printStackTrace();

        } finally { // the only way it won't be executed we can explicitly call the exit method before the block
            // it is alsow an interview question
            System.out.println("Finally Block");
        }
     /*
     Interview Question:
     The final, finally, and finalize are keywords in Java that are used in exception handling. Each of these keywords
     has a different functionality. The basic difference between final, finally and finalize is that the final is
     an access modifier, finally is the block in Exception Handling and finalize is the method of object class.
    */


    }
}
