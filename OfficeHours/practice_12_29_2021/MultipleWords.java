package practice_12_29_2021;

import java.util.Arrays;

/*

    Task :  Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
         */
public class MultipleWords {
    public static void main(String[] args) {

        String words = "knife, wooden spoon, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] splitArr = words.split(", ");
        System.out.println(Arrays.toString(splitArr));  // all the words in the String now in a String array.
        for(String eachWord:splitArr){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }

        }







    }
}
