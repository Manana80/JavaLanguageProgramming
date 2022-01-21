package day41_Exceptions;

import day39_Recap.day39_Recap_CydeoTask.Student;

import java.io.FileInputStream;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

        // unchecked exception: it wasn't checked during compile time

        int a  = 10;
        int b = 0;
      //  System.out.println(( a / b)); // this exception if not dealt with it is going to crash the program
     // exit code 1 : meaning something went wrong

        System.out.println("Wooden Spoon"); // it won't be able to run since we got exit code 1 , program was terminated

        //example 2
        char[] characters = {'A','B','C'};
      //  System.out.println(characters[99]); // everything looks normal but it will give us unexpected error
        // ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3


        //example 3

        Student student = null; // this is the wrong way to create an object meaning the student object has never been created
      //  System.out.println(student.getName()); // the method cannot be called without the object , and we have no object here.
        // the exception we will get is : Exception in thread "main" java.lang.NullPointerException

        String str = "Wooden Spoon"; // now this is unrefrenced and it is marked for garbage collector
        str = null; //no object is refrenced by str. it is NOTHING

        //P.S. when we use final we can not send this variable garbage collector

        // example 4
       // System.out.println(str.toUpperCase());
        // we will get: Exception in thread "main" java.lang.NullPointerException

        System.out.println("-----------------Checked Exceptions------------------------------------------");
        // these happen while compile time
        // these exceptions require immediate handling since the code won't even run without dealing with it.

        System.out.println("Hello");

       // Thread.sleep(3000); // pause the execution of code for the given milliseconds
        // we are getting error at line 43  at the method

        System.out.println("Cydeo");

       // FileInputStream file  = new FileInputStream("path of the file");
        //Unhandled exception: java.io.FileNotFoundException compile will give us this error message
        // Exception means something is going to crash our program and compiler can check it.

        System.out.println("java.charAt(20000)"); // unchecked exception , looks normal but will give error during run time





















    }
}
