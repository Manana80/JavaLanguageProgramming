package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b = a; // meaning we want to convert (a)  to the sort type variable.

        //short b = (short)a happens automatically in the background

        // since the value of a is less than b (byte is smaller than short)
        // i.e. the range of byte falls within the range of the short
        // so compiler will automatically convert it to short in the background.

        int c = b; // because int can contain the range of short.
                   // int c = (int)b; in the background.

        long d = c; // long d = (long)c; in the background.
        float e = d;
        double f = e;
        // from a to f are examples on implicit casting.
        System.out.println( "---------------------");
        int x = 55;
        // short y = x; this will give us an error because int is larger than short
        short y = (short)x; // this is called explicit casting and should be done manually.
        System.out.println(x + " : " + y);

        long j = 1000000;
        // short k = j;  It can not be done, we need to do it manually
        short k = (short)j;
        // () casting operator
        // between the parentheses we cast the name of the smaller variable.
        System.out.println( j + " : " + k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : "+ m);

        double n = 10.8;
        int s = (int)n; // because double is larger. explicit casting
        // the result will be 10 not 11 because java doesn't do rounds up!!

        System.out.println( n + " : " + s);
        System.out.println( "-----------------------------");

        // shortcuts to casting
        // right it the way you want it. so when compiler error appears,
        // after the; hold Alt and hit Enter and choose the correction from IntelliJ.

        double d1 = 20.5;
        // write it as short s1 = d1;
        short s1 = (short) d1;
        System.out.println( d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println( f1 + " : "+l1);

        int layan = 41;
        short aymen = (short)layan;
        System.out.println("aymen = " + aymen);
        float asim = 5578.678f;
        double lamees = (double)asim;
        System.out.println("lamees = " + lamees);
        byte misk = (byte) lamees;
        System.out.println("misk = " + misk);
        short mohammed = (short)lamees;
        System.out.println("mohammed = " + mohammed);



    }
}
 /*
 Simple explanation from a classmate: Think of casting as putting an object in a box.
 The smallest box is the byte box then short box and so on.
 When you put an object in a bigger box, you don’t need to do anything;
 that’s the optional implicit casting.
 When you “try” to fit an object in a smaller box, you may have to do some trimming
 (you cannot enlarge the box as memory size is an outside constraint, but you may trim the object);
  that’s the required explicit casting.
  If the object is small enough, although it’s of a bigger type,
  it may end up being the same even after the trimming, like when you cast the short 100 into byte,
   it remains 100.
   However, in general trimming will change the object,
   like when you cast the short 128 into byte,
   it becomes -128 which does not look like the original object (128) at all.
   Hence, the necessity to correctly use casting.
  */