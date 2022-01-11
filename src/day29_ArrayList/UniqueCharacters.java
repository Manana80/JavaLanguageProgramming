package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        list.removeIf(p -> Collections.frequency(list,p)>1);
        System.out.println(list);
        String unique = "";
        for (String each : list) {
            unique += each;

        }
        System.out.println(unique);












    }
}
