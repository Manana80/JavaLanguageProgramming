package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class RemonveElements2 {




    public static int [] removeElement (int[]array, int index){
        int [] result = {};

        for (int i = 0; i < array.length; i++) { // i is the array's index number
            if (i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }












}
