package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = ""; // expected result: ABC

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+ str.charAt(i); // "A", "A", "B", "B", "C", "C"
            // the reason why we concatenated the "" to char so that we can use the contains() which is only used for string.
            if (result.contains(ch)){ // if the result already contains the ccc we need to skip it
                continue;
            }
            result += ch;

        }

        System.out.println(result);









    }













}
