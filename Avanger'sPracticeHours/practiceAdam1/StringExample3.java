package practiceAdam1;

/**
 * Given a string, return a version without the first and last char, so " Hello" yields "ell".
 * The String lenght will be at least 2.
 */
public class StringExample3 {
    public static void main(String[] args) {

        String str = "Selcuk";
        String str1 = str.replace("" + str.charAt(0), "");
        str1 = str1.replace("" + str1.charAt(str1.length() - 1), "");
        System.out.println(str1);

        String str2 = str.substring(1, str.length() - 1);
        System.out.println(str2);

        char first = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        str = str.replace(first, ' ');
        str = str.replace(lastChar, ' ');
        System.out.println(str.trim());


    }
}
