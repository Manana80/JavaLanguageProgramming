package day18_NestedLoop;
/*
Write a program that can divide two positive numbers without using / (division) , remainder % and * (multiplication) operators
 */
public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;
        int count = 0;

        while (a>=b){
            a -= b;
            count++;
        }

        System.out.println(" The result is " + count + " and the remainder is " + a);

// this is an interview question

    }
}
