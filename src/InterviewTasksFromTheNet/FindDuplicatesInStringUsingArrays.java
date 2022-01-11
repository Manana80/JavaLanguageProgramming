package InterviewTasksFromTheNet;

import java.util.Arrays;

// how to find the duplicates in an array
public class FindDuplicatesInStringUsingArrays {
    public static void main(String[] args) {
        String str = "Layan loves Aymen and Aymen loves Layan";
        String[] words = str.split(" "); // splits the string at choosen point and convert it into a String array.
        for (int i = 0; i < words.length; i++) { // outer loop will pick the element
            for (int j = i+1; j < words.length; j++) { // inner loop will check the picked element with the rest of the elements in the array
                if(words[i].equals(words[j])){
                    System.out.println(words[i] + " is a duplicate");
                }
            }
        }
    }
}
