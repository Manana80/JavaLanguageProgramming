package day19_LoopPractices;

/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */
public class FindingUniqueCharacters {

    public static void main(String[] args) {


        String str = "aabccdeef";
        String result = ""; //bdf

       /*
        char character = 'a';
        int count = 0; // represents the frequency of the ch
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // each character of str
            if (character == each) {
                count++;

            }
        }
        System.out.println(count);
        */
        int count = 0;

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'a'
             count = 0; // represents the frequency of the ch
      // The inner loop will find the frequency of one character. Hence, it needs to be repeated to find the frequencies of other charcters
            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }


       // System.out.println(count);
        System.out.println(result);


    }
}







  /*
  In this task  yes that’s what inner & outer loops are doing.
Inner loop: gets the characters need to be checked
Outer loop: compares the characters outer loop picked with each characters of the string and return the frequency.

Example if outer loop get the character ‘a’ in the first execution then inner loop is going to compare ‘a’
 with each characters of the string and counts how many time is appeared, when the outer loop executed second and third times inner loop is going to do the same to return the frequency of those characters that outer loop picked (edited)
        */



