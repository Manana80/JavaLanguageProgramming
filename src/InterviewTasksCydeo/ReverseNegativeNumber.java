package InterviewTasksCydeo;
import java.util.Scanner;
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

 */
public class ReverseNegativeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a negative number");
        int number = scan.nextInt();
        if(number >=0){
            throw new RuntimeException("Sorry, Invalid number: "+ number);
        }
        System.out.println("reverseNegativeNumber(number) = " + reverseNegativeNumber(number));

        scan.close();
    }






public static int reverseNegativeNumber (int number){
    number = number * -1; // so that we can use the loop to get the reverse without creating an infinite loop
    int reverse = 0;
    int lastdigit = 0;

    while (number>=1){
        lastdigit = number%10; // this will give us the last digit on the right.
        reverse = reverse*10 + lastdigit;
        number = number/10; // to get rid of the last digit and go to the second last.
    }
    return  reverse*-1;
}



}
