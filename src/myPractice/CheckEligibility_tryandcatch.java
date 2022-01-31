package myPractice;
/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program
 * should return that the student is not eligible for registration.
 */
public class CheckEligibility_tryandcatch {
    static void checkEligibility(int StudentAge, double StudentWeight){
        if (StudentAge<12 && StudentWeight<40){
            throw new ArithmeticException("Student is not eligible for registration");
        } else{
            System.out.println("Student Entry is valid!!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Registraion process!!");
        checkEligibility(10,39);
        System.out.println("Have a nice day..");
    }









}
