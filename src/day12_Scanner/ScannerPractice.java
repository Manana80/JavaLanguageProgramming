package day12_Scanner;

// Here should be the import statement above the class and beneath the package.

/*import java.util.*; // wild import: imports everything from the package.
 This is not good because everything is memory (memory is a resource) and this is inefficient. It is a waste*/

import java.util.Scanner; // This class is only specific for scanner.
// Regular import: imports one class
// If we want several classes but not all the entire classes. Again we need to import each and every class one by one.

public class ScannerPractice {
    public static void main(String[] args) {

        // use shortcut to import, just type Scanner and hit enter
        // Declaring Scanner variable, after = just type new then space and hit enter


        /*
        Scanner class : used for getting user inputs. This is not the only thing scanner function can do.
        Scanner class needs to be imported from the "util" package which itself is subpackage of the Java Package.
        Java is the Parent package, util is subpackage
        Syntax of import statement:
        import package.class;
        import java.util.Scanner;
        - Declaring a scanner:
        Scanner variable name = new Scanner (System.in)
        (new means creating an object in Java)
        (Scanner is a constructor which should have same named as the class name)

        Scanner Methods: (the method will determine what kind of input the user can put)
        nextInt()
        nextDouble()
        nextBoolean()
        next()
        nextLine()
         */

        Scanner scan = new Scanner(System.in);
        // we now need to call a scanner method (should have similar name to Scanner variable in this case (scan)
        System.out.println("Enter a number between 1-7:"); // should be placed before the scanner method. scan.nextInt();
        // otherwise, if the scanner object wasn't assigned to a variable then we have to create new object every single time which will take more memory.
        // e.g. new Scanner(System.in) = scan.nextInt();
        // how can we reuse the number the user's provided? by creating a variable (container)
        int num = scan.nextInt();
        String result = "";

        if (num >= 1 && num <= 7) { // 7 possible outputs
            result = (num == 1) ? "Monday" :
                    (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" : (num == 5) ? "Friday"
                            : (num == 6) ? "Saturday" : "Sunday";
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);

        /*
        In order to close the scanner, use the close method. Always given at the end
        scan. close();
        we can not re-open it
        we can create a new object
         */


    }


}
