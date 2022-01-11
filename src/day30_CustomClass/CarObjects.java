package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) { // different objects have different copies
        Car car1 = new Car();
        car1.setInfo("Toyota","Camry","Silver",2021,35000.99);

        System.out.println(car1);
        car1.drive();

        Car car2 = new Car();
        car2.setInfo("BMW","331is","Black",2020,45000.99);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi","Q7","Red",2019,40000.99);

        System.out.println(car3);

        Car [] cars = {car1,car2,car3};
        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carList);

        for (Car each:carList){           // each represents a car
            System.out.println(each.brand + " "+ each.price);
        }

        System.out.println("------------------------------------------------------------------------");
/*
cars eligible for recall
BMW 2005 ~ 2008
Toyota: 1995 ~ 1997
 */
        carList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year<=2008 );
        carList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year<=1997 );












    }
}
