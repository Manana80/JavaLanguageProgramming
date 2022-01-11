package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        // write a program that can display the number  15 to 45 one by one in the same line separated by a space
        // 15 16 ... 45

for(int i = 15; i<=45; i++){ // i: 15 16 17 ... 45

    System.out.print(i + " "); // i is the local variable of this block
    // i.e. i cannot be called outside this block.

}
        System.out.println(); // this statement to create a new line so that Hello will be printed in a new line.

        System.out.println("Hello"); // in this case Hello will be printed immediately after 45
        System.out.println("---------------------------------------");

        // now write a line 100 99 98 to 50

        for (int i = 100; i>=50; i--){ // since the previous loop ended this i is not the same as the previous i
            //i: 100, 99, 98 ... 50 the loop will stop at 50 because when i =49 it will make the condition false

            System.out.print(i + " ");

        }
        System.out.println("--------------------------------------");
        // print the even numbers between 1 and 55.

        for (int i = 1; i<+55; i++){
           if(i % 2 == 0){
               System.out.print( i + " ");
           }
        }
        System.out.println();

        System.out.println("------------------------------------------------");
        // another solution to the previous task

        for(int i =2; i<=54;i+=2 ){ // i: 2 ,4,6,8....54
            System.out.print(i + " ");

        }

        System.out.println();

    }
}
