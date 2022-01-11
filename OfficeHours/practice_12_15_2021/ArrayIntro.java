package practice_12_15_2021;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String [] color = {"Yellow","Blue", "Purple"};

        //finding the size of Array
        System.out.println(color.length);

        //equals
        int[] num = new int [4];
        num[0]=42;
        num[1]=35;
        num[2]=12;
        num[3]=9;
        System.out.println(Arrays.toString(num));
        int[] num1 = {1,2,3};
        System.out.println("Arrays.equals(num,num1) = " + Arrays.equals(num,num1));


        // sort
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));






        String [] colors = new String[3];
        colors[0]= "Red";
        colors[1]= "White";
        colors[2]= "Green";

        System.out.println(Arrays.toString(colors));
        System.out.println(color[1]);









    }
}
