package day04_Variables;
/*
Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
                    Hints: 1 kg = 2.2 pounds
 */
public class KgToPounds {
    public static void main(String[] args) {
        // 1 Kg = 2.2 pounds
        int kg = 86;
        double kgToPound = kg * 2.2;


        System.out.println("kg = " + kg);
        System.out.println("kgToPound = " + kgToPound);
    }
}
