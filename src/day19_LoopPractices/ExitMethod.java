package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i==3){
            //    break; // terminates the loop, but not the print statements outside the loop.
             //   continue; // terminates the current iteration of the loop

                System.exit(0); // 0 is the exit code i.e. exiting without problems
                /*
                 this exit method will terminate the entire program
                  anything inside the loop or outside it will be terminated.
                  once the condition is true , everything after this point will be exited
                 */

            }


        System.out.println(i);

        }
        System.out.println("Wooden Spoon");



    }
}
