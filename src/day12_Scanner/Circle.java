package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");

        double r = scan.nextDouble(); // to save the input and be able to reuse it.

        // scan.close();  we can place it here when we know where we won't be using the scanner any more
        // if not just place it at the end.
        double area = r * r* 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = "+ perimeter);


        // Scanner will be still connected after finishing. Hence we have to give the close method

 scan.close();







    }
}
