package day28_ArrayList;

import java.util.ArrayList;

//short video exercise
public class IteratingArrayListWithForLoop {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);       // index:0
        numbers.add(20);       // index:1
        numbers.add(30);       // index:2
        numbers.add(40);       // index:3
        numbers.add(50);       // index:4
        numbers.add(60);       // index:5 number.size() - 1



        for (int i = 0; i < numbers.size(); i++) { // getting each element starting from the first index to the last index.
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------------------------------------");
        for (int i = numbers.size() - 1; i >= 0; i--) { // getting each element from the last index to the first index.
            System.out.println(numbers.get(i));
        }

        System.out.println("-----------------------------------------------------------");

        for (Integer each : numbers) {
            System.out.println(each);
        }







    }
}
