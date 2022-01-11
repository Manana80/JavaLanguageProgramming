package day25_CustomMethodLoading;

import java.util.Arrays;

/*
  1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array
 */
public class AddElementsToArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
      arr=  addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------------------------------");


        double []arr2 = {1.5,2.5,3.5,4,5};
        arr2=addDecimal(arr2,5.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-----------------------------------------------------------------");


        String [] names = {"Layan", "Cassandra","Ali","Tatiana"};
        names = addString(names,"Neira");
        System.out.println(Arrays.toString(names));
        names=addString(names,"Suhaib");
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------------------------------");

        char[] chars = {'a','b','c'};
        chars=addChar(chars,'d');
        System.out.println(Arrays.toString(chars));
        chars=addChar(chars,'e');
        System.out.println(Arrays.toString(chars));




    }











//1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
            {       //i++ so the current value will pass and then increases every time the loop turns.

                result[i] = element;        //  after the loop is done we can now add the element to the array

            }

        }
        return result;
    }

//2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDecimal(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
            {

                result[i] = element;

            }

        }
        return result;
    }
//3. create a return method called addString that can add a String after the last index of a String array

    public static char[] addChar (char[] array, char element){
        char[] result = new char[array.length + 1];
        int i =0;
        for (char each : array) {
            result[i++] = each;
        }
        result [result.length-1] = element; // result[i]=element;
        return result;
    }

//  4. create a return method called addChar that can add a char after last index of a char array
    public static String[] addString(String[] array, String element) {

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
            {

                result[i] = element;

            }

        }
        return result;
    }








}




