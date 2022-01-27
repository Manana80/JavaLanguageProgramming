package day42_Exceptions;
/*
MorningWorkOut:
        1. Do 30 push-ups and try pausing 1.5 seconds in each


        2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("---------------------Push up started----------------------------------");

        for (int i = 1; i <=30 ; i++) {


        System.out.print("\rpush up  "+ i); // \r will print the new line in place of the previous line
            sleep(1.5);

        }

        System.out.println("----------------------- Push ups are completed ------------------------- ");

        System.out.println("---------------------Pull up started----------------------------------");

        for (int i = 1; i <=20 ; i++) {


            System.out.print("\rpull up  "+ i); // \r will print the new line in place of the previous line
           sleep(2.5);

        }

        System.out.println("----------------------- Pull ups are completed ------------------------- ");






    }




    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000)); // the reason why we are casting to long since the user enters double and the sleep data is Long (builtin)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }













}
