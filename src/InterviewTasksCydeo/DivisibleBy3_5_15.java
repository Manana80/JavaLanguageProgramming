package InterviewTasksCydeo;
/*
Write a program that can print the numbers between 1~100 that can be divisible by 3,5 and 15.
if the number can be divisible by 3,5 and 15, then it should only be displayed in Divisible by 15 section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible by 3
section.
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible b 5
section
 */
public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        String divisibleBy15="";
        String divisibleBy3= "";
        String divisibleBy5="";

        for (int i = 1; i <101 ; i++) {
            if(i%15==0){
                divisibleBy15+=""+ i + " ";
            }else if(i%5==0){
                divisibleBy5+= " "+ i + " ";
            }else if (i%3==0){
                divisibleBy3+=" "+ i + " ";
            }else{
                System.out.println();
            }

        }
        System.out.println("divisibleBy3 : " + divisibleBy3);
        System.out.println("divisibleBy5 : " + divisibleBy5);
        System.out.println("divisibleBy15 : " + divisibleBy15);



    }
}
