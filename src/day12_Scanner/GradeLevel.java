package day12_Scanner;
/*
 Create a class called GradeLevel, Given a number(byte) grade level
 determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both
 */
public class GradeLevel {
    public static void main(String[] args) {
        byte num = 4;
        String gradeLevel = "";

        switch (num){
            case 1: case 2: case 3: case 4: case 5:
                gradeLevel = "Elementary School";
                break;
            case 6: case 7: case 8:
                gradeLevel = "Middle School";
                break;
            case 9: case 10: case 11: case 12:
                gradeLevel = "High School";
                break;
            case 13: case 14: case 15: case 16:
                gradeLevel = "College";
                break;
            case 17: case 18:
                gradeLevel = "Grad School";
                break;
            default:
                gradeLevel = "Invalid grade level is given";

        }
        System.out.println(gradeLevel);

        System.out.println("------------------------------------------");

        if (num>=1 && num<=18){
            switch (num) {
                case 17: case 18:
                    gradeLevel = "Grad School";
                    break;
                case 6: case 7: case 8:
                    gradeLevel = "Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    gradeLevel = "High School";
                    break;
                case 13: case 14: case 15: case 16:
                    gradeLevel = "College";
                    break;
                default:
                    gradeLevel = "Elementary School";
                    // under this if condition we chose for the default to take the most cases. 1-5
            }
        }
        else {gradeLevel = "Invalid grade level is given";}
        System.out.println(gradeLevel);


    }
}
