package day23_CustomMethods;

public class CustomMethodsParameters {
    public static void main(String[] args) {

        oddOrEven(89); // the method demands additional info to complete its task
        ageOfPerson(1980);

        printNumbers(5,9);




    }


    // create a function that can check if a number is odd number or even number
    // whenever an information is needed to complete an action then parameters are needed.
    public static void oddOrEven (int number){

        if (number%2==0){
            System.out.println(number + " is an even number");
        } else{
            System.out.println(number + " is an odd number");
        }


    }

    // create a function that can display the age of the person , here we need to have the birth year
    public static void ageOfPerson (int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: "+ age);

    }

    // create a function that can print all the numbers between x and y.
    // example           x=10 and y =50
    public static void printNumbers (int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.print(i + " ");
        }
    }













}
