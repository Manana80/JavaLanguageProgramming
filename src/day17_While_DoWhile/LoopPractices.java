package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) { // this is the best solution but not the only one.
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------");
        int j = 1; // this is the initialization in for loop
        while(j<=10){

            System.out.println(j);
            j++; // this is the iteration in for loop , if given before the statement it will give us the wrong resutl
        }


// Hence, whenever we know the number of repetitions it is always better to use for loop.(always preferred)

        System.out.println("-------------------------------------------------------------");

        int k =1;
        do{
            System.out.println(k);
            k++;
        }while (k<=10);







    }













}
