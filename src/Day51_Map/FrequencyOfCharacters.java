package Day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Interview question
 Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";
        // expected   b  c  a          key
        //            2  3  5          value

        // we can use the Collections.frequency();
        String [] arr = str.split("");

        Map <String, Integer> result = new LinkedHashMap<>();
        for (String each : arr) { // each: characters of the string which we need to add the map as keys
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each, frequency);

        }
        System.out.println(result);












    }
}
