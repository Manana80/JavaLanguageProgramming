package day16_ForLoopStringPractice;
/*
"Java" ---> "avaJ" ----> 'false'
"Anna" ---> "annA"-----> 'this is a palindrome' true
racecar, dad, mom, level
the task is say whether the word is palindrome or not?
 */
public class Palindrome {
    public static void main(String[] args) {


    String word = "level";
    String reversed = "";

    for(int i = word.length()-1; i>=0; i--){
        reversed += word.charAt(i);

    }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
    // we should place it after the curly braces of the loop
        System.out.println("isPalindrome = " + isPalindrome);


    }
}
/*
my solution
 String word = "Layan";
        String reverse = "";
        String result = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            char each = word.charAt(i);
            reverse += each;
            if (reverse.equalsIgnoreCase(word)){
                result = " is palindrome";
            }
            else {
                result = " is not palindrome";
            }

        }
        System.out.println(word + result);



 */