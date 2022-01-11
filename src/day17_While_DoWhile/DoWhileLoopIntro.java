package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;
        for (int i = 0; a ; ) {
            System.out.println("Wooden spoon -- for loop");

        }
        System.out.println("-----------------------------------------------------");

        while (a){ // since the condition is false, the statement won't even be executed once!
            System.out.println("Wooden Spoon");
        }
        System.out.println("---------------------------------------------------");
        do{
            //Loop Body
            System.out.println("Wooden Spoon");
        }while (a);

// this is the only difference between the three loops
        // do while gets executed at least once before checking the condition.

        /*
        while loop: repeated if statement
        while (condition){
        statement;}

        do-while: JUST DO IT. It first executes then check the condition
        do {
        statement;}
        while (condition);
         */











    }













}
