package day05_Concatenation;
/*
 Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */
public class Birthday {
    public static void main(String[] args) {
        String name = "Layan";
        int birthDate = 05;
        String birthMonth = "June";
        int birthYear = 1980;

        // We can assign / to char. However, since it is not a variable and always constant no need.


        System.out.println(name + " was born on " + birthMonth  + "/" +birthDate+ "/"+ birthYear+".");
      // My favorite book is "bookName"

        String bookName = "The Rich Dad and The Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");
        // we use the escape sequence \" in order to include a quote in our string sequence.
        /* Remember the escape sequences:
        \n : new line
        \t : horizontal tab
        \" : double quote
        \\ : back slash
         */

    }
}
