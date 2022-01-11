package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        String result = "";
        switch (grade){
            case 'A':
                result = "Excellent";
                //System.out.println("Excellent");
                break;
            case 'B':
                result = "Great Job";
                //System.out.println("Great Job");
                break;
            case 'C':
                result = "Good";
               // System.out.println("Good");
                break;
            case 'F':
                result = "Passed";
                //System.out.println("Passed");
                break;
            case 'D':
                result = "Failed";
                //System.out.println("Failed");
                break;

            default:
               result = "Invalid";
                //System.out.println("Invalid");

        }
        // Print statement should always be after the switch statement NOT inside it!
        System.out.println("result = " + result);


    }
}
