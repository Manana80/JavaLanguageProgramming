package day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer>number = new ArrayList<Integer>();

        ArrayList<String>names = new ArrayList<>();


        System.out.println(number);  // no need to import Arrays.toString () in order to print it because it is built in automatically
        System.out.println(names);


        ArrayList<Double>arr1 = new ArrayList<>();
       arr1.add(3.4);
       arr1.add(2.6);
       arr1.add(9.1);
       arr1.size();
        System.out.println(arr1 +":"+ arr1.size());


    }
}
