package day15_ForLoop;

import java.util.Locale;

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
public class FormatFullName {
    public static void main(String[] args) {
      String  firstName = "cyDEo", lastName = "SCHOOL";

  //(This is one way)
  // firstName= firstName.substring(0,1). toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase(Locale.ROOT);
// we cannot use charAt because it will return us char       ydeo
//    returns string C

firstName = (""+firstName.charAt(0)).toUpperCase(Locale.ROOT)+firstName.substring(1).toLowerCase(Locale.ROOT);
    // a way of converting char to string by concatenating it to an empty string

        lastName=lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase(Locale.ROOT);
        System.out.println(firstName+" "+lastName);

        // try toUpperCase().charAt(0)!!

/*
A third solution totally by me :)
Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String first = scan.nextLine().toLowerCase();

        System.out.println("Please enter your last name:");
        String last = scan.nextLine().toLowerCase();

        String firstUpper = first.toUpperCase().charAt(0)+"";
        System.out.println(""+firstUpper);
        String lastUpper = last.toUpperCase().charAt(0)+"";
        System.out.println(""+ lastUpper);

        String firstName = first.replaceFirst(first.charAt(0)+"",firstUpper);
        System.out.println(firstName);
        String lastName= last.replaceFirst(last.charAt(0)+"",lastUpper);
        System.out.println(lastName);
        System.out.println(firstName+" "+ lastName);


 */



    }
}
