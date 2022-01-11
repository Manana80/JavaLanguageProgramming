package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

      int num1 = 200; // without autoboxing , we cannot use this data in data structures other than Arrays.
        Integer n1 = num1; // autoboxing
        // Long n1 = num1; will give us compiler error since different data for different class

        int num2 = n1; // unboxing
        System.out.println("------------------------------------------------------------------");

        Integer integerValue = 100; // it can be converted to any primitive value that I want (long,short, byte..etc) as long as it was in the range of that primitive
        long longValue = integerValue;

        System.out.println("---------------------------------------------------------------------");
        int num3 = 200;
        //Long12 = num3;
        Integer num4 = num3; // autoboxing

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("------------------------------------------------------");

        int numa = 200;
        //long l2=numa;      not allowed
        //double d1 = numa;  not allowed

        System.out.println("------------------------------------------------------");

        Integer z = 900;
        Integer y = z;        // neither autoboxing nor unboxing

        System.out.println("------------------------------------------------------");

        int [] numbers  = {1,2,3,4};      // in arrays no need to use wrapper classes
        Integer [] numbers2 = {1,2,3,4};  // in other data structures.

        /*

         */




    }
}
