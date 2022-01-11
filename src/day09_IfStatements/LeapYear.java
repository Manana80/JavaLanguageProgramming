package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = year%4 ==0;
        if (leapYear) {
            System.out.println("Year " + year + " is a leap year.");}

        if (!leapYear) { System.out.println("Year " + year + " is NOT a leap year.");}
        // there are two independent if statement. Java compiler will check each one separately.
        // Even if the first statement was correct, Java compiler will still have to work on it.

        System.out.println("------------------------------------------");


        if(leapYear) {
            System.out.println("Year " + year + " is a leap year.");}
        else { System.out.println("Year " + year + " is NOT a leap year.");}





    }
}
