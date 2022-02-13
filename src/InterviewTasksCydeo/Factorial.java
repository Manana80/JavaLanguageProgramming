package InterviewTasksCydeo;
/*
Write a mehtod that returns the factorial of any given number.
Ex: Input:5
    Output: 120
    // factorial = 1 * 2 * 3 * 4 * 5 =120
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial(7) = " + factorial(7));
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("factorial(10) = " + factorial(10));
    }




    public static int factorial(int number){
        int factorial =1;
        for (int i = 1; i <=number; i++) {
            factorial *=i;
        }
        return factorial;
    }
}
