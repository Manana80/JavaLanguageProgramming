package day2__12_11_2021;
/**
 * 4.
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (do with for loop)
 * input:  kitchen and 2
 * output: kichen
 * input:  kitchen and 0
 * output: itchen
 */
public class StringWithoutGivenIndex {
    public static void main(String[] args) {
        String word = "kitchen";
        int index=2;
        String temp = word.substring(0,2)+ word.substring(2+1);
        System.out.println("temp = " + temp);
        String temp2="";
        for (int i = 0; i < index; i++) {
            temp2+= word.charAt(i);
        }
        System.out.println("temp2 = "+temp2);
        String temp3 = "";
        for (int i = 0; i < word.length(); i++) {
            if (i==index)
                continue;
            temp3 += word.charAt(i);
        }
        System.out.println("temp3 = " + temp3);
    }
}
