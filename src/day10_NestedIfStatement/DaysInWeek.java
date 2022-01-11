package day10_NestedIfStatement;

public class DaysInWeek {
    public static void main(String[] args) {
        int n = 4; // 1 ~7

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


        System.out.println("----------------------------------------------------");
        /*
        Since all if blocks are returning us one statement , and since all are returning the same
        data value. Hence, we can use ternaries.
         */
        String day = (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday"
                :(n==4)? "Thursday" :(n==5)? "Friday" :(n==6)? "Saturday": "Sunday";
        // last else no need for condition

        System.out.println(day);










    }
}
