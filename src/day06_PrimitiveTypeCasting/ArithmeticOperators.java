package day06_PrimitiveTypeCasting;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/*
+: Addition
-: Subtract
*: Multiplication
/: Division
in math: 10/4  = 2.5
in java: by default the type is int so the result it will turn me is int , i.e. 2
However, if either or both are decimals then the result will be decimal as well.
10.0/4 or 10.0/4.0 or 10/4.0 will give us 2.5

integer / integer ----- integer
decimal / integer ----- decimal
integer / decimal ----- decimal
decimal / decimal ----- decimal
%: Remainder
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println( 10 + 20); // Addition
        // System.out.rintln ("12" + 1); // 121, concatenation
        System.out.println( 100 - 50); // Subtraction
        System.out.println( 10 * 6); // Multiplication
        System.out.println( 100/3 ); // Division with Integer result i.e. 33
        System.out.println(10.0/4); // result will be 2.5
        System.out.println( (double) 10/4); // another way to get the decimal result
        System.out.println(10d/4); // a third way to get a decimal result (casting d to either the numerator or the denominator.

        int a = 100;
        double b = a/6;// the result will be 16 (implicit casting is happening because 16 is integer but the data type is double)
        // so implicit casting is happening and the result will be 16.0.

        double c = a/6.0; // to get the result 16.6666
        System.out.println(c);
        System.out.println(b);

        System.out.println( 100D); // the D will convert it to decimal when run.







    }



}
