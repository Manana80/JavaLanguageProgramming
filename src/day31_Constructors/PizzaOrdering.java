package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        // create 100 pizza objects size - 'S' , cheeseTopping -2, pepperoniTopping -3;
        // create 100 pizza objects size - 'M' , cheeseTopping -3, pepperoniTopping -4;
        // create 100 pizza objects size - 'L' , cheeseTopping -4, pepperoniTopping -5;
        ArrayList<Pizza> pizzas = new ArrayList<>();

        for (int i = 0 ; i<100; i++){
            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));


        }



        System.out.println("Total number of pizza: "+ pizzas.size());
        double totalPrice = 0;

        for (Pizza pizza : pizzas) {
            totalPrice += pizza.calCost();

        }
        System.out.println(totalPrice);



















    }
}
