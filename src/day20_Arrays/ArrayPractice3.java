package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        // ask the user how many numbers does he want to enter(it can't be zero or negative.
        // then ask the user to enter a number for the total number he/she chose.
        // store the numbers in an array variable.

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();  // this is the length of the array
        if (length <=0){
            System.err.println("Invalid entry");
            System.exit(0); // terminates JVM.
        }


        int[] numbers = new int[length]; // the size of the array will be determined by the user's answer.
        for (int i = 0; i < length; i++) { // this loop to answer the user to enter numbers and assign each one to an array.
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt(); // each input user provided during each execution of the loop, will be assigned t ot the indices of the array.
        }
        System.out.println(Arrays.toString(numbers));


        scan.close();
    }
}
