package day26_CustomMethodPractice;
// check this task again, check the previous methods mentioned here since there is an error

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,3,2,2,3,3,3,4,5,6,1,5,7};
       int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }






// A method that returns the unique integer element  from the integer array.
public static int[] uniqueElements(int[] array){
    int[] result = {}; //new int[0]

    for (int each : array) {

        if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
            result = ArraysUtility.addElement(result, each);
        }

    }

    return result;
}




}
