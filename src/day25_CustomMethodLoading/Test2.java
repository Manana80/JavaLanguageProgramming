package day25_CustomMethodLoading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int [] arr1 = {10,1,20,36,4,5,63,7,8,9};
       ArraysUtility.printEach(arr1);
        int max= ArraysUtility.max(arr1);
        int min=ArraysUtility.min(arr1);
        boolean b1=ArraysUtility.contains(arr1,5);

        System.out.println("max number = " + max);
        System.out.println("min number = " + min);
        System.out.println(b1);


        System.out.println("---------------------");

       double [] arr2 = {10.4, 1.2,3.4,5.6,7.1,8.9};
       ArraysUtility.printEach(arr2);
       double max1 = ArraysUtility.max(arr2);
       double min1 = ArraysUtility.min(arr2);
       boolean b2 = ArraysUtility.contains(arr2,8.2);
        System.out.println("max number = " + max1);
        System.out.println("min number = " + min1);
        System.out.println(b2);

        System.out.println("---------------------");

        char [] arr3 = {'a','b','c','d'};
        boolean b3=ArraysUtility.contains(arr3,'l');
        ArraysUtility.printEach(arr3);
        System.out.println(b3);

        System.out.println("---------------------");

        String [] names = {"Layan","Aymen","Lamees","Aasim","Misk"};
        boolean b4= ArraysUtility.contains(names,"Aymen");
        ArraysUtility.printEach(names);
        System.out.println(b4);

        System.out.println("---------------------");










    }



}
