package day08_IfStatements;

/*
 Create a class called NameOfTheMonth, write a program that can display the name of the month

           pre-condition : number = 1 ~ 12


 */
public class NameOfTheMonth {
    public static void main(String[] args) {

        int month = 6;
        boolean jan = month == 1;
        boolean feb = month == 2;
        boolean mar = month == 3;
        boolean apr = month == 4;
        boolean may = month == 5;
        boolean jun = month == 6;
        boolean jul = month == 7;
        boolean aug = month == 8;
        boolean sep = month == 9;
        boolean oct = month == 10;
        boolean nov = month == 11;
        boolean dec = month == 12;

        if(jan){
            System.out.println("January");
        }
        if(feb){
            System.out.println("February");
        }
        if(mar){
            System.out.println("March");
        }
        if(apr){
            System.out.println("April");
        }
        if(may){
            System.out.println("May");
        }if(jun){
            System.out.println("Jane");
        }if(jul){
            System.out.println("July");
        }if(aug){
            System.out.println("August");
        }if(sep){
            System.out.println("September");
        }if(oct){
            System.out.println("October");
        }if(nov){
            System.out.println("November");
        }if(dec){
            System.out.println("December");
        }


    }
}
