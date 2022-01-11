package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //1. print each integer array in separate lines.
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //2. print each double of double array in separate lines.
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //3. print each char of a char array in separate lines.
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //4. print each String of a String array in separate lines.
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //5. return the maximum number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //6. return the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //7. return the minimum number for integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //8. return the minimum number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //9. Check if the given integer is contained in the given array. Returns boolean. contains(int[],int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //10. Check if the given double element is contained in the given array. Returns boolean. contains(double[],double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //11. Check if the given char element is contained in the given array. Returns boolean. contains(char[],char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    //12. Check if the given String element is contained in the given array. Returns boolean. contains(String[],String)
    public static boolean contains(String[] array, String element) {// if any arrays element is matching with the given element is contained.
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    //13. adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //14. adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //15. adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //16. adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //17. A method that returns the frequency of the given integer element from the integer array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }


    //18.  A method that returns the frequency of the given double element from the double array
    public static double frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //19.  A method that returns the frequency of the given char element from the char array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    //20.  A method that returns the frequency of the given String element from the String array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    //21. returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {}; //new int[0]

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    //22. returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {}; //new int[0]

        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    //23. returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {}; //new int[0]

        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    //24. returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {}; //new int[0]

        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    //25.removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //26.removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //27.removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //28.removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //29.merge the given two int arrays and returns the new int array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }


    //30. merge the given two double arrays and returns the new double array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }


    //31. merge the given two char arrays and returns the new char array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }


    //32. merge the given two String arrays and returns the new String array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }


    //33. reverse the given int array, returns a new int array
    public static int[] reverse(int[] array) {
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    //34. reverse the given double array, returns a new double array
    public static double[] reverse(double[] array) {
        double[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    //35. reverse the given char array, returns a new char array
    public static char[] reverse(char[] array) {
        char[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    //36. reverse the given String array, returns a new String array
    public static String[] reverse(String[] array) {
        String[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    // 37. The method replaces the element of the  int [] array at given index with the new element, and returns the new int[]array.
    public static int [] replace (int [] array, int index, int newElement){
        if(index <0 || index > array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;
    }


    // 38. The method replaces the element of the double []array at given index with the new element, and returns the new double []array.
    public static double [] replace (double [] array, int index, double newElement){
        if(index <0 || index > array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;
    }


    // 39. The method replaces the element of the char[] array at given index with the new element, and returns the new char []array.
    public static char [] replace (char [] array, int index, char newElement){
        if(index <0 || index > array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;
    }


    // 40. The method replaces the element of the String [] array at given index with the new element, and returns the new String[]array.
    public static String [] replace (String [] array, int index, String newElement){
        if(index <0 || index > array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index]= newElement;
        return array;
    }


    // 41. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static int [] replaceAll(int[]array,int oldValue,int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // 42. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static double [] replaceAll(double[]array,double oldValue,double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // 43. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static char [] replaceAll(char[]array,char oldValue,char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }


    // 44. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static String [] replaceAll(String[]array,String oldValue,String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i].equals(newValue);
            }
        }
        return array;
    }


    // 45. The method removes the duplicates from the given array, returns the new array.
    public static int [] removeDuplicates (int[] array){
        int [] result = {};
        for (int each: array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // 46. The method removes the duplicates from the given array, returns the new array.
    public static double [] removeDuplicates (double[] array){
        double [] result = {};
        for (double each: array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // 47. The method removes the duplicates from the given array, returns the new array.
    public static char [] removeDuplicates (char[] array){
        char [] result = {};
        for (char each: array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // 48. The method removes the duplicates from the given array, returns the new array.
    public static String [] removeDuplicates (String[] array){
        String [] result = {};
        for (String each: array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }



















    //clear



}
