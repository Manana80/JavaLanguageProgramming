package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

       // Store these elements in an array: 10,20,50,70

       int[]numbers={10,20,50,70};

        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------------------------------------");
        // create a variable that can contain 5 scores.
        // since we do not know the element we should go with the first one of initializing.

        int[] scores = new int[5]; // it has 5 un-assigned elements [0,0,0,0,0]
        scores[1]=85;
        scores[scores.length - 1]=90; // length() to find out the length of the array  (-1 to find the last index number)
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

        String[]months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(Arrays.toString(months));

       /*
       to call the number of months individually either print 12 statements or use for loop
        System.out.println(months[0]);// Jan
        System.out.println(months[1]); // Feb
        */

for(int i = 0; i<months.length;i++){ // i, represents the index numbers starting from 0
    System.out.println(months[i]);
}

        System.out.println("--------------------------------------------------");
// reading the months from the end to the beginning.(backward)
        for (int i = months.length-1; i >=0; i--) { // i, represents the index numbers of the array starting from the last index
            System.out.println(months[i]);

        }












    }
}
