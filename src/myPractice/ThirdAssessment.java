package myPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ThirdAssessment {
    public static void main(String[] args) {
String [] cities = {"Boston","houston", "Austin","Lincoln", "Tulsa"};
ArrayList<String>list = new ArrayList(Arrays.asList(cities));
int a = list.size();
for (String str: list){
    String rev = "";
    for(int i  = str.length()-1; i >=0; i--){
        rev += str.charAt(i);
    }
    list.set (--a,rev); // first a=4, then a=3, then a=2, then a=1 then a=0
    // this task is like creating a mirror effect that gives the word and it's reflection at the end of the array

}
        System.out.println(list);







    }







}