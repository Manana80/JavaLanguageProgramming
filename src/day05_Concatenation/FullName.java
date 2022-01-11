package day05_Concatenation;
/*
1. Create a class called FullName.java
2. Declare the following variables:
1.firstName
2.lastName
3. Age of the person
4. Job title
5. Company name
6. Salary = 100000.58
Use concatenation to print the full name
 */
public class FullName {
    public static void main(String[] args) {
        String firstName = "Aymen";
        String lastName = "Ali";
        String fullName = firstName + " " + lastName; // the double quotes contain space, because space is a character
        int age = 44;
        String jobTitle = "Specialist";
        String companyName = "Microsoft Inc.";
        double salary = 100000.58;
        char currency = '$';

        // Full name of the person is _____
        // full name of the person is ____ is ____years old
        //FullName is Job title, works at companyName and Full name's salary is ____

        System.out.println(fullName + " is " + jobTitle +" , works at " + companyName +
                " and " + fullName +"'s salary is " + currency + salary );}
// I can hit enter within the print statement so that it won't be difficult to read and edit.
}
