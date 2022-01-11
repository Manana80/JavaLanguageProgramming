package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

    // we need to give import statement which is better placed between the package and class name.
    // in order to declare scanner variable:
    // the name of the variable should be understandable and meaningful.

    Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
    int numb1 = input.nextInt();
        System.out.println(numb1);


        System.out.println("Enter a decimal: ");
    double numb2 = input.nextDouble(); // This is the method to use double
        // to reuse this variable in order to re-sue it again we should assign it to a name here double numb2.

        System.out.println(numb2);

        System.out.println(" Multiplication: " + (numb1*numb2));

        /*
        Everytime we use scanner at the end of the class use the close method so that the scanner will
        be terminated and hence we can not give any more input hence preserving the memory and keeping
        the quality of the performance of the code and itelliJ
         */

       input.close(); /* closes the scanner
        System.out.println("Enter an integer: ");
        int num3 = input.nextInt();
        System.out.println("num3 = " + num3);
        Scanner can not be used anymore.
        */






    }


}
