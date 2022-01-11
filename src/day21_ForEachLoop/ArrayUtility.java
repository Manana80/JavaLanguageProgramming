package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5}; // the string method cannot be located and cannot be applied implicitly
        //hence, we need to call the string method from the array utility class.
        String str = "Java"; // str.toString(); this happens implicitly by compiler.
        System.out.println(str); // it will print immediately
        // For array this won't happen implicitly.

       System.out.println(nums);// if we pass it this way without the string method it will give us hashcode[I@27f674d

        System.out.println(Arrays.toString(nums)); // Ths string method is called explicitly

     // String(): will only be used when we want to start the whole array

        System.out.println("-----------------------------------------");

        //Sort();
        int [] scores = {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores); // {55,65,78,85,95,100}
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: "+ scores[0]);
        System.out.println("Max score: "+ scores[scores.length-1]);


        String[] names = {"Gunay","Anna","Zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); // ANNA, Anna because lower case letters have higher numbers on ASCII Table
        System.out.println("-------------------------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean r1 =Arrays.equals(arr1,arr2);
        System.out.println(r1);

        // if we want to ignore the order and just compare the elements we have to sort them first.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("--------------------------------------------------------");
        // Are these words anagrams? "bac" and "acb"
        char[] ch1 = {'a','c','b'}; // anagram means words that have same characters (interview question)
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r3 =Arrays.equals(ch1,ch2);
        System.out.println(r3);





    }
}
