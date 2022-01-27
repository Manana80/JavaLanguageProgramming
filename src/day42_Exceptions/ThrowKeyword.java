package day42_Exceptions;

public class ThrowKeyword {
    public static void main(String[] args) throws InterruptedException {
        /*

                      First Solution
        System.out.println("-------------------Test 1 -----------------------------------");
        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Cydeo");
        System.out.println("---------------------Test 1 completed--------------------------------");



        System.out.println("------------------Test 2 --------------------------------------");
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Batch 25");

        System.out.println("-------------Test one completed");



         */


        // Second Solution using throw keyword after the method signature
        System.out.println("-------------------Test 1 -----------------------------------");
        System.out.println("Hello");

            Thread.sleep(3000);

        System.out.println("Cydeo");
        System.out.println("---------------------Test 1 completed--------------------------------");



        System.out.println("------------------Test 2 --------------------------------------");
        System.out.println("Hello");

            Thread.sleep(2000);

        System.out.println("Batch 25");

        System.out.println("-------------Test one completed");




    }
}
