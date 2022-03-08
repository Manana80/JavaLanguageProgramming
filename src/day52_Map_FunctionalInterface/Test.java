package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {
/* rather than creating 3 separate method we can use the functional interface method since the common feature
        among these 3 method is that they all take int parameter!

         */

        // lambda: () -> {}


        // function 1: create a function that can dispaly if the number is odd or even

        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {// give a short name or character as an argument (convention)
           if(n%2==0){
               System.out.println(n + " is an even number");
           }else{
               System.out.println(n + " is an odd number");
           }
        };
        oddOrEvenNumber.apply(20);

        // function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol= (a)-> {
          if(a>=21){
              System.out.println("Eligible to buy Alcohol");
          }else{
              System.out.println("Ineligible to buy Alcohol");
          }
        };
        eligibleToBuyAlcohol.apply(17);


        // function3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube= c->  // parenthesis are totally optional in case the method is passing only one parameter
            // however if the method is passing no parameter or more than one then parenthesis are mandatory
            System.out.println(c*c*c);
        // if the body is only one line , curly braces are optional as well
        printCube.apply(5);


        //function 4: create a number that can check if a number is evenly divisible by 3 and 5

        MyFirstFunctionalInterface divisibleBy3And5 = n -> {
            if(n%15==0){
                System.out.println(n + " is divisible by 3 and 5");
            }else {
                System.out.println(n + " is not divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(30);












    }
}
