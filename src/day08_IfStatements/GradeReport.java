package day08_IfStatements;
/*

valid score is between 0 ~ 100
The score of the student is 85, what will be his/her grade?
90 ~ 100 == > Excellent
80 ~ 89  == > Great
70 ~ 79 == > Good
60 ~ 69 == > Passed      ~equals to or greater than
0  ~ 59 ==> Failed

 */
// 5 possible outcomes, hence we need 5 if single statements.


public class GradeReport {
    public static void main(String[] args) {
        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89;
        // another way of giving the expression score>=80 && !a.
        boolean c = score >= 70 && score <= 79;
        // Another expression: boolean c = !a && !b && score >= 70;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        // another way of writing f is: boolean f = !a && !b && !c && !d;

        if (a) { // the meaning of this boo lean variable is the student made an (a).
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("Good");
        }
        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println("Failed");
        }


    }
}
// boolean expressions are the key for if statements.
