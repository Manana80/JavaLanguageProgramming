package day08_IfStatements;
/*
Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1; (is the number of the month).
                // a valid number would be 1 ~ 12;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */
public class NumberOfDays {
    public static void main(String[] args) {
        int number = 5;
        boolean has28Days = number == 2; // this is the boolean expression for Feb.
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11; // for the months that have 30 Days.
        boolean has31Days = !has28Days && !has30Days; // if the month doesn't have 28 days and doesn't have 30 days.
        // It is much easier than writing a new boolean expression similar to the one of has30Days.

        if (has28Days) { // if the month has 28 Days, if true then this expression will show on the console.
            System.out.println("28 days");
        }
        if (has30Days) { // if the month has 30 days.
            System.out.println("30 days");
        }
        if (has31Days) { // if the month has 31 days.
            System.out.println("31 days");

            // This logical operator OR || , the vertical line is called pipeline key.
        }
    }
}