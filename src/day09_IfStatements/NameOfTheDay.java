package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        int n = 5; // n = 1 ~ 7 (preconditions for the task) based on the given number we need to print the name of the day.

        if(n == 1){
            System.out.println("Monday");
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if( n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n==6){
            System.out.println("Saturday");
        } else{
            System.out.println("Sunday");
        }

        System.out.println("-----------------------------------");

        String day;
     // An easier way to solve the task by using the assignment operator.

        if(n == 1){
            day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3){
            day = "Wednesday";
        }else if( n == 4){
            day = "Thursday";
        }else if(n == 5){
            day = "Friday";
        }else if(n==6){
            day = "Saturday";
        } else{
            day = "Sunday";
        }

        System.out.println("day = " + day);



    }


}
// the arrangement of the else if is not necessary, i.e. we can put 6 before 2 the most important thing we create them all.

