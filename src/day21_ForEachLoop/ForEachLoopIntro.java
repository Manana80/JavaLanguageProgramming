package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60,70};
         // index          0, 1, 2, 3, 4, 5, 6
        for (int i = 0; i < numbers.length; i++) { // most advanced loop in java
           int eachElement = numbers[i];
            System.out.println(eachElement);
        }
        System.out.println("---------------------------------------------------");

        for(int each:numbers){ // each: elements of the array

            // It is not possible to retrieve the elements in a reversed order because both the order and the number of iterations is fixed.
            System.out.println(each);

            // Foreach loop can be nested within other loop














        }


















    }
}
