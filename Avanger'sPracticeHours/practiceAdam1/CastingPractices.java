package practiceAdam1;

public class CastingPractices {
    public static void main(String[] args) {
        // byte to short
        byte b = 10;
        short s = b; // implicit casting

        // double to int
        double d = 5.4;
        int i = (int) d; // Explicit casting

        // long to int
        long l = 99999999; // no need for L here because, it is implicit casting and done automatically
        long l1=9999999999l; // here we need to write the l to force intillJ
        long k = (int)l1;
        System.out.println("k = " + k);

        //Quiz Question/ also casting is very imp in interviews

        float a = 12.12f; //  if written this way float a = 12.12;  we will get a compiler error because on the right side we have a double and double is bigger than float
        // so either add the f or
        // double f = 12.12;

       int ivar = 10;
       //float fvar = 12.5; // again we have error because on the right side we have double and double is the biggest variable.
       double dvar=12;








    }
}
