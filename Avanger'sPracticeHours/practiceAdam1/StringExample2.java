package practiceAdam1;

/**
 * Create a method print a new string made of 3 copies of the last 2 chars of the original string.
 * The string length will be at least 2.
 * String str = "Cydeo"
 */
public class StringExample2 {
    public static void main(String[] args) {

        String str= "CYDEO";

        int lastCharIndex = str.length() - 1;
        int secondToLastCharIndex = str.length() - 2;
        String result =""+str.charAt(secondToLastCharIndex)+str.charAt(lastCharIndex);
        System.out.println("result.repeat(3) = " + result.repeat(3));

        String str1=str.substring(str.indexOf("E"));
        System.out.println(str1.repeat(3));
        

    }
}
