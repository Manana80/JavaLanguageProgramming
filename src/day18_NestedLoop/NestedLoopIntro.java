package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < 20; j++) { //0,1,2,3
            for (int i = 0; i < 5; i++) { //0,1,2,3,4
                System.out.println("Wooden Spoon");
            }

        }

/*
Nested loop: loop inside another loop (inner and outer loops)
one iteration of the outer loop executes al the iteration of hte inner loop.
 */

    }
}
