package day19_LoopPractices;

/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "aabcccd";
        String result = ""; // this should be the output a2b1c3d1


        for (int j = 0; j < str.length(); j++) { // to repeat the inner loop and find every single character and hence find the frequency of each character.

            char ch = str.charAt(j);   //'a'
            int count = 0; // help us to count how many each character is repeated


            for (int i = 0; i < str.length(); i++) { // each character of the string
                char each = str.charAt(i); // representing each character of the str.

                if (ch == each) {
                    count++;
                }

            }
            if (result.contains("" + ch)) { // to remove the duplicated character
                continue;
            }

            result += ch;
            result += count;


        }

        System.out.println(result);


    }
}