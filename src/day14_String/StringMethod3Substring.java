package day14_String;

import javax.lang.model.SourceVersion;

public class StringMethod3Substring {
    public static void main(String[] args) {
        /*
        substring()  when we want a portion of the string
        substring(beginning index, ending index)
         */
        String word = "Cydeo School";
        //             01234567...11
        //String brand=word.substring(0,4);//if we put 4 we get Cyde not Cydeo.
        // in substring method , the last index number will be excluded hence we should add 1
        String brand=word.substring(0,5); // in order to return us Cydeo
        System.out.println("brand = " + brand);

        String str1 = word.substring(6,12);
        // if we want to get a substring from a certain point to the ending index. we don't need to specify it.
        //String str1 = word.substring(6); same result
        System.out.println("str1 = " + str1);


        String word2 = "Java Programming Language";
       int first = word2.indexOf("a ");
        System.out.println("first = " + first);
        String s1 = word2.substring(0,4);                         // Java
        System.out.println("s1 = " + s1);


        int second = word2.indexOf(""+1); // alternative solution
        int lastSpace= word2.lastIndexOf("");
        System.out.println("second = " + second);
        System.out.println("lastSpace = " + lastSpace);
        String s2 = word2.substring(5,16);                        // Programming
        System.out.println("s2 = " + s2);

        /*Muhtar's solution
        String s2 = word2.substring(word2.indexOf("")+1, word2.lastIndexOf(""));
        This is for a sentence that has 3 words
         */

        int third= word2.indexOf("L");
        System.out.println("third = " + third);
        
     /*
     String s3 = word2.substring (word2.lastIndexOf("")+1);
     System.out.println("s3 = " + s3);
      */






    }
}
