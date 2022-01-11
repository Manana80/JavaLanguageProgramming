package day23_CustomMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5times();
        System.out.println("-----------------------------------");
        helloCydeo5times();
        System.out.println("-----------------------------------");
        evenNumbers();


    }


    // create a function that can print hello word 5 times ==> helloWorld5times()

    public static void helloWorld5times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }


    // create a function that can print hello Cydeo 5 times ===> helloCydeo5times()

    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }


    // create a function that can print all the even numbers from 1~10 ==>

    public static void evenNumbers(){

        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i+" ");
        }


    }


}
