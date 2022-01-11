package day2__12_11_2021;

/**
 * Given a string, if the first or last chars are 'x', print the string without those 'x' chars,
 * and otherwise print the string unchanged.
 * (do with for loop)
 * <p>
 * <p>
 * input :"xHix" → Hi
 * input :"xHi" → Hi
 * input :"Hxix" → Hxi
 */
public class StartingOrEndingWithX {
    public static void main(String[] args) {
        String word = "xHix";
        String temp = "";

        if (word.charAt(0) == 'x' && word.charAt(word.length() - 1) == 'x') {

            for (int i = 1; i < word.length() - 1; i++) {
                temp += word.charAt(i);
            }
        } else if (word.charAt(0) == 'x' && word.charAt(word.length()) == 'x') {
            for (int i = 1; i < word.length(); i++) {
                temp += word.charAt(i);
            }
        } else if (word.charAt(word.length() - 1) == 'x') {
            for (int i = 1; i < word.length() - 1; i++) {
                temp += word.charAt(i);
            }
        } else {
            System.out.println(word);
    }
        System.out.println(temp);
}}