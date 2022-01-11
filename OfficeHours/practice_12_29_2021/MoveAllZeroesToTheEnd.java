package practice_12_29_2021;

import java.util.Arrays;

/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                {10, 5, 1, 0, 0, 0}
 */
public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int [] array = {10, 0, 5, 0, 1, 0};
        int [] result = new int [array.length];
        int i = 0;

        for (int each : array) {
            if(each!=0){
                result[i]=each;
                i++;
            }
        }

        System.out.println(Arrays.toString(result));

        // can also be solved by sorting then reversing;


/*

make sure it works!  a comment from classmate: if the numbers are not in order(like {5,9,0,7,0,2}), this solution won't work
  int[] array = {10, 0, 5, 0, 1, 0};
        ArrayList<Integer>reverse = new ArrayList<>(Arrays.asList(10, 0, 5, 0, 1, 0));

        reverse.sort(Collections.reverseOrder());

        System.out.println(reverse);
 */





    }
}
