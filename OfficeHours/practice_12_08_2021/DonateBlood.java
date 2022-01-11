package practice_12_08_2021;

import java.util.Scanner;

/**
 * Create a program that accepts age and weight(kg) as int.
 * <p>
 * If age greater than or equal 18 and weight greater than 50 kg give a message
 * EXPECTED  :  "You are eligible to donate blood"
 * <p>
 * If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
 * EXPECTED  :  "You are not eligible to donate blood"
 * <p>
 * If age is smaller than 18 "Age must be greater than 18"
 * EXPECTED  :  "Age must be greater than 18"
 */
public class DonateBlood {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = input.nextInt();
        System.out.println("Please enter your weight:");
        int weight = input.nextInt();
      if(age>=18){
          if(weight>50){
              System.out.println("You are eligible to donate blood");
          }else{
              System.out.println("You are not eligible to donate blood");
          }
      }else{
          System.out.println("Age must be greater than 18");
      }


        System.out.println("=============Ternary=================");


        String result=(age>=18)? (weight>50)?"You are eligible to donate blood"
                :"You are not eligible to donate blood":"Age must be greater than 18";

        System.out.println(result);




input.close();






    }
}
