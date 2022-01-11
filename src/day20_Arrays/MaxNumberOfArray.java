package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};// find out the maximum number

        int max= numbers[0]; // assume that the first element is the max then start comparing to the next
        // if it was greater replace it, if not check it out and continue to the end of the array

        for (int i = 0; i < numbers.length; i++) { // shortcut to iterate the array from the first index to the last type the name of array.fori ===> it will be created
            if(numbers[i]>max){ // if there is an element in the array that's greater than the current max number
                max = numbers[i];
         //   for (int i1 = numbers.length - 1; i1 >= 0; i1--) {// call the arrayName.ferr===> creates an array that reads from right to left.

            }
        }

        System.out.println(max);
        }

    }

