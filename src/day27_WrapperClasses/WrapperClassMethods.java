package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

String str = "123";

int num = Integer.parseInt(str); // it will return us int values
        System.out.println(num +1); // 124 addition
        System.out.println(str + 1 ); // 1231 concatenation

        String str2 = "10.5"; // this is a text
        double d1 = Double.parseDouble(str2);
        System.out.println(d1 * 3);

       int max=  Integer.MAX_VALUE;    // this is a variable in this class
       int min = Integer.MIN_VALUE;   // this is a variable in this class
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        String s1 = "true";
       boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);
        // if in hte string we have "maybe" it will be converted to false by default

        System.out.println("----------------------------------------------------------------------");
        String s2 = "123";
        Integer x = Integer.valueOf(s2); // Integer
        int y = x; // returns the primitive integer
        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3); // Double
        System.out.println(z);
        System.out.println("-------------------------------------------------------------------------");

        // isDigit()
        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);

        char ch2 = 'L';
        boolean r3 = Character.isDigit(ch2);
        System.out.println(r3);
        boolean r4 = Character.isLetter(ch2);
        System.out.println(r4);

        // for special ccc

        char ch4 = '&';
        boolean b4 = ! Character.isLetterOrDigit(ch4);
        System.out.println(ch4);


        // upperCase
        boolean r6 = Character.isUpperCase(ch2);
        System.out.println(r6);

        //lowerCase
        char ch5 = 'm';
        boolean b2 = Character.isLowerCase(ch5);
        System.out.println(b2);

        System.out.println("--------------------------------------------------------------------");

        // find how many digits are there in this string

        String s = "ab1cde2ffeg3hi4";
        int sum = 0;
        for (char each: s.toCharArray()){
            if (Character.isDigit(each)){
               //  sum+= each; this will return us 202 because digits in ascii table have values which are summed here. we need the sum of the digits themseleves hence we need to convert them to int variables
                sum +=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);





    }
}
