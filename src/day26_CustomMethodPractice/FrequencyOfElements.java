package day26_CustomMethodPractice;
/*
FrequencyOfElements:
            1.1 Create a method that passes two parameters: an integer array and an Integer element.
            The method returns the frequency of the given integer element from the integer array

            1.2 Create a method that passes two parameters: a double array and a double element.
            The method returns the frequency of the given integer from the array

            1.3 Create a method that passes two parameters: a char array and a char element.
            The method returns the frequency of the given char element from the char array

            1.4 Create a method that passes two parameters: a String array and a String element.
            The method returns the frequency of the given String element from the String array

 */
public class FrequencyOfElements {
    public static void main(String[] args) {
        int [] arr = {1,1,1,11,1,2,2,3,3,3,4,4,1,1,1,1};
        int n = frequencyOfElement(arr,1);
        System.out.println(n);

        double [] arr1 = {1.5,1.5,1.5,11.6,1.5,2.9,2.9,3.2,3.2,3.3,4.8,4.8,1.5,1.8,1.0,1.2};
        int d = (int) frequencyOfElement(arr1,1.5);
        System.out.println(d);

        char [] arr2 = {'A','A','A','B','B','B','B','B','B','C','C'};
        int c = frequencyOfElement(arr2,'B');
        System.out.println(c);

        String [] arr3 = {"Layan","Layan","Manana","Manana","Manana","Manana","Manana","Manana","lulu"};
        int name = frequencyOfElement(arr3,"Manana");
        System.out.println(name);


    }















    //  A method that returns the frequency of the given integer element from the integer array
    public static int frequencyOfElement (int[]array,int element){
        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //  A method that returns the frequency of the given double element from the double array
    public static double frequencyOfElement (double[]array,double element){
        int count = 0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //  A method that returns the frequency of the given char element from the char array
    public static int frequencyOfElement (char[]array, char element){
        int count = 0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //  A method that returns the frequency of the given String element from the String array
    public static int frequencyOfElement (String[]array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }






















}
