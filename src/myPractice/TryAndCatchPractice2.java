package myPractice;

public class TryAndCatchPractice2 {
    static void fun()throws IllegalAccessException{
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }



    public static void main(String[] args) {
        try{
            fun();  // remember when the method is called the exception won't be handled after calling if the
            // the method handled the exception through using throws keyword (handles temporarily) so now the
            // execption will be caught via the catch block

        }catch (IllegalAccessException e){
            System.out.println("caught in main");
        }
    }










}
