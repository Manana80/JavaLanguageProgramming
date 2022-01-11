package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {

        String str = "ABCD#^$$## 123004kljfdojjf";

        String digits = "";            // 12345
        String letters = "";           // Cydeo Wooden Spoon
        String specialChar = "";       //!@#$%

        for (int i = 0; i < str.length(); i++) { // i: represents index number of str. (0-last)
            char ch = str.charAt(i); // ch: represents every single character that we have in str.
            if(ch>='0'&& ch <= '9') {// if the character is between '0' to '9'
                digits += ch;
            }
            else if (ch>='a'&& ch<'z'|| ch>='A'&&ch<='Z'){
                letters +=ch;
            }else{ // if the ccc is neither digit nor letter then it is special ccc.
                if (ch !=' '){ // if the special ccc is not a space.i.e this condition is not include the space as a ccc.
                specialChar+= ch;
            }}

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);



    }
}
