package practice_12_15_2021;

import java.util.Scanner;

/*
           (StringTimes)
           Given a string and a non-negative int n, return a larger string that is n copies of the original string.

            input String : Hi  ,  input int : 2

               output: HiHi
*/
public class StringTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word.");
        String word = input.nextLine();
        System.out.println("Enter any positive number");
        int num = input.nextInt();

        int count = 0;  // it has a similar function to the iterator in the for loop and it determines the initialization step
        String sum="";

        while(count<num){   // this is the condition
            sum+= word;
            count++; // to end the while loop (represents i++ i.e. iterator)
        }

        System.out.println(sum);

/*
solution with for loop
for ( int i =0; i<num;i++){
sum +=word;}
System.out.println(sum);
 */










    }

}
