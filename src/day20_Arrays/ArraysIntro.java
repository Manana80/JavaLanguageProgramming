package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) { // String [] i.e this is an array!

        // create a variable that is capable enough to contain five names
        // in this case we have to use data structure since it can hold more than one variable at once.

        //String [] myGroup; // brackets can be placed either before or after variable name

        //[] brackets are reserved for Arrays in Java. Hence, no need to import any class for it.

        String[] myGroup = new String[5]; // data type must match with variable data type
        // the size of array MUST be set, and it will be fixed.
        myGroup[0] = "Gunay"; // assigning a data to an array.
        myGroup[1] = "Neira";
        myGroup[2] = "Layan";
        myGroup[3] = "Elena";
        myGroup[3] = "Muhtar"; // this name will be displayed on the console but not Elena since each array can contain only one object
        myGroup[4] = "Suat";

        System.out.println(Arrays.toString(myGroup)); // the variable of the array cannot be passed directly into print statement it will give us an error called hash code.
        // we need to call string method

        System.out.println("--------------------------------------------------------");
        // ask the user to enter the name and return the corresponding day of the week
        // in this case we know the data and their numbers
        // in this case we declare the array this one:

        String[]days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //               0         1        2            3          4      5         6


        System.out.println(Arrays.toString(days));
        int number =4;
        if(number<=1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }


        System.out.println(days[number-1]); // no need to call Array, and sting method


        System.out.println("----------------------------------------------------");


        String[]months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(Arrays.toString(months));

        int num = 7;
        if(num <=1||num>12){
            System.err.println("Invalid number");
            System.exit(0);
        }


        System.out.println(months[num-1]);








    }
}
