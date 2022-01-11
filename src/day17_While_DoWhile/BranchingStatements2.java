package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if (i=='C'){
                continue; // what happens is , it is going to skip this iteration and jumps to the next
            } // ABDE   // if use break it will exit at C result will be AB


            System.out.println(i);

        }

        System.out.println("------------------------------------------------------");

        // print all even numbers 1~10 (skin the odd numbers)
        for (int i = 1; i < 11; i++) {
            //if(i%2==0){System.out.println(i);
            if (i%2 !=0){
                continue;
            }
            System.out.println(i);

        }
        System.out.println("-----------------------------------------------------");

// print all odd numbers between 1~10 (skip the even numbers)
        for (int i = 1; i < 11; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("---------------------------------------------");


// break statement: exits the loop and switch.
        // continue statement: exits the current iteration of the loop



    }












}
