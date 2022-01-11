package day14_String;

import java.nio.charset.StandardCharsets;

public class EmailDomainSubstring {
    public static void main(String[] args) {
        /*
        Write a program that can get the domain of the email. (Assume that a valid email is given)
        ex.
        email = Cydeo.School@gmail.com
        output:
        gmail
        email = "School.Cydeo@yahoo.com
        output: yahoo
         */

        String email = "Cydeo.School@gmail.com";

        //domain: every single domain is between the @ and . .
        // This is a universal solution. regardless of what the email is

int beginningIndex = email.indexOf("@")+1;
int endingIndex = email.lastIndexOf(".");
String domain = email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);


        System.out.println("----------------------------------------------------------");
        
        String str1 = "Java is fun, Java is cool, I love Java";
         // assign java is fun to s1 variable by manual counting
        
        String s1 = str1.substring(0,11);
        System.out.println("s1 = " + s1);

        // assign Java is cool to the variable s2 using indexOf()

        /*
        int beg = str1.lastIndexOf(" J")+1;
        int ending = str1.lastIndexOf(",");
        String s2 = str1.substring(beg,ending);
        System.out.println("s2 = " + s2);

         */
        String s3 = str1.substring(str1.lastIndexOf("I"));
        System.out.println("s3 = " + s3);
        











    }
}
