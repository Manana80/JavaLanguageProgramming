package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,6,6,7,8,7,9,9));
        ArrayList<Integer>unique = new ArrayList<>();

        for (Integer each : list) {
           int frequency =  Collections.frequency(list,each);
           if (frequency ==1){
               unique.add(each);
           }

        }
        System.out.println(unique);

        System.out.println("---------------------------------------------------------");
        // second solution without using loop

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,6,6,7,8,7,9,9));
        ArrayList<Integer> unique2 = new ArrayList<>(list2);
        unique2.removeIf(p -> Collections.frequency(list2,p)>1);
        System.out.println(unique2);














    }
}
