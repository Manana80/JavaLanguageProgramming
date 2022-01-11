package day25_CustomMethodLoading;
//Interview Question:
import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int[] intArray = {5, 6, 0, -1, 3, 4};
        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        char[] charArray = {'E', 'F', 'D', 'C', 'A'};

        // to sort these method we use the same method , i.e. sort method is overoaded
        Arrays.sort(intArray);
        Arrays.sort(doubleArray);
        Arrays.sort(charArray);

        // these are three different methods but they have the same name as they have similar functionality.

        System.out.println("-------------------------------------------------------------------------");
        sumOfNumbers(10,20,50);
        sumOfNumbers(4.5,7.2,9.3);
        System.out.println("--------------------------------------------------------------------------");

        // sum of 10, 20
        int sum1 = sumOfNumbers(10,20);
        System.out.println("sum1 = " + sum1);
        // sum fo 20,10,30
        int sum2 = sumOfNumbers(20,10,30);
        System.out.println("sum2 = " + sum2);
        // sum of 10,20,30,40
        int sum3 = sumOfNumbers(10,20,30,40);
        System.out.println("sum3 = " + sum3);
        // sum of 18,2, 30.7
        double sum4 = sumOfNumbers(18,2,30.7);
        System.out.println("sum4 = " + sum4);
        // sum of 5.4,6.2,8.4,12.9
        double sum5 = sumOfNumbers(5.4,6.2,8.4,12.9);
        System.out.println("sum5 = " + sum5);



    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
    public static double sumOfNumbers(int num1, int num2, int num3, int num4,int num5) { // it is ok to pass different parameter type than
        // the return type the most important thing is pass different parameters in each method.
        return num1 + num2 + num3 + num4;
    }
    public static double sumOfNumbes(double num1,double num2, double num3, double num4){
        return sumOfNumbers(num1,num2,num3)+num4; // another way of writing the return method by calling sumOfNumber (3) then add the num4.

    }
}
/*
If the return type and method name are the same, parameters must be different. If return type is different then the parameters can be similar but they would have a different data types in the parameters. Can mix and match but it cannot be identical to another method.

1. public static int sum(int num1, int num2)
2. public static double sum(double num1, double num2)
3. public static double sum(double num1, int num2)
4. public static double sum(int num1, double num2)

X - public static double sum(int num1, int num2) - same parameters as #1
X - public static int sum(double num1, double num2) - same parameters as #2
X - public static int sum(double num1, int num2) - same parameters as #3

so you can put public static double name(int 1 int 2 etc)?

 */