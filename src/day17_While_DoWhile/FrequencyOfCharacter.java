package day17_While_DoWhile;
/*
Write a program that can return the frequency of char from a String.
Ex:
str = "AAABBBC"
ch = 'A'
Output : 3
 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {

      String str = "AAABBBCAAAAAABBBBBBBBBBBBAAAAAABBBBBBBBEEEDDDAAA";
      char ch = 'B';

      int frequency = 0; // +1 every time the char is matching the frequency should increase by 1.

        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of the string str
           //'A' == 'A'
            if (ch == eachChar){ // if given char is matching with eachChar, then ch is appeared int the string.
                frequency++; // to increase by one each time
             // we can also use frequency += 1;
            }

        }
        System.out.println(frequency);

    }
}
// This task cannot be solved without loop!