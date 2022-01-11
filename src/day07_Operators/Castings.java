package day07_Operators;

/*
create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */
// remember: Implicit casting is from smaller to larger, done automatically by the compiler.
// Explicit casting is from larger to smaller value, should be done manually by us.
public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; // java cannot round, so it will only take the integer data.
        // This is Explicit casting

        short num2 = (short) averageScore; // Explicit casting

        int num3 = (int) averageScore;    // Explicit casting
        // I can also cast short to int because it is smaller, int num3 = (short) averageScore;
        //However, it is better to always cast

        long num4 = (long) averageScore;   // Explicit casting

        float num5 = (float) averageScore; // neither implicit nor explicit casting because they are the same value

        double num6 = (double) averageScore; //Implicit casting
        // the last casting two casting appears in grey because it is IntelliJ's way of telling us it is not necessary, since it can do it automatically.

        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        System.out.println("num3 =" + num3);
        System.out.println("num4 =" + num4);
        System.out.println("num5 =" + num5);
        System.out.println("num6 =" + num6);

    }
}
