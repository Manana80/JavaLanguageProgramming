package day26_CustomMethodPractice;

import java.util.Arrays;

/*
 Create a class named RemoveElements:
            2.1 Create a method that passes two parameters: an integer array and an integer index.
            the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}

            2.2 Create a method that passes two parameters: a double array and an integer index.
            the method removes the element at the given index of the array and returns the new array


            2.3 Create a method that passes two parameters: a char array and an integer index.
            the method removes the element at the given index of the array and returns the new array

            2.4 Create a method that passes two parameters: a String array and an integer index.
            the method removes the element at the given index of the array and returns the new array

 */
public class RemoveElements1 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}

        numbers = removeElement(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));



    }


    //                              {1,2,3,4,3}   ,    4
    public static int[] removeElement(int[] array, int index){
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int[array.length -1]; //1,2
        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

/*
I understand now, when you use 'for each', it finds the element at that index, and removes all of the matching elements.
so if you have array {1, 2, 3, 4, 3, 4, 5} and want to remove index 2
'for each' gets [ 1, 2, 4, 4, 5, 0] - Removes the second element 3 because it matched
the corrected way gives us [1, 2, 4, 3, 4, 5] only removing the 3 at index 2
 */































}
