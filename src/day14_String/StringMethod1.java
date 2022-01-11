package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 = "    batch  25     "; // those spaces before batch and after 25 are defined as white spaces.
        // but not the one between batch 25.
        // to remove the white spaces we can use trim().

        str1.trim(); // it creates a new string that doesn't include the white spaces // "batch 25"

// in order to get the result after modification we need to assign the modified version back to the original variable name.
        str1= str1.trim();
        System.out.println(str1);
        System.out.println("------------------------------------------------");

        String str2 = "Cydeo School";
        int n1 =str2.indexOf("h"); // we can pass h as a string or as a char.
        // since it will return us a number we assigned it to int.
        System.out.println("n1 = " + n1);
        // it will always start from the left side of the string so in case of the letter o
        int n2 = str2.indexOf("o"); // it will return us the first o of the string!!
        System.out.println("n2 =" + n2);
        int n3 = str2.indexOf("ool"); // in order to find the first o in school
        System.out.println("n3 = " + n3);


        String str3 = "Java Programming language";
        int n4 = str3.indexOf("a");
        System.out.println("n4 = " + n4);
        //for the second a
        int n5 = str3.indexOf("a ");  //the first a with space afterward is the second a (i.e. make it unique)
        System.out.println("n5 = " + n5);

        // for the third a
        int n6 = str3.indexOf("amm");
        System.out.println("n6 = " + n6);

        // for the fourth a
        int n7 = str3.indexOf("an");
        System.out.println("n7 = " + n7);

        // for the first g
        int n8 = str3. indexOf("g");
        System.out.println("n8 = " + n8);
        //for the second g
        int n9 = str3.indexOf("gua");
        System.out.println("n9 = " + n9);

        int n10 = str3.lastIndexOf("g");
        System.out.println("n10 = " + n10);

        System.out.println("------------------------------------------------");
        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a"); // no need to make it unique . it will look for the (a) from left to right and the first matching one will return
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a"); // this method will return the first (a) from right to left.
        System.out.println("lastA = " + lastA);

        // for the second a
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        // int fourthA = s.indexOf("ava W"); this is one way
        int fourthA = s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);
        // int fourthA = s.indexOf("Ca")+1;

        int fifthA = s.lastIndexOf("a W");
        //int fifthA = s.lastIndexOf("va") = 1;
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

       // int seventhA = s.lastIndexOf("a o");
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);

        int eighthA = s.lastIndexOf("a");
        System.out.println("eighthA = " + eighthA);










    }
}
