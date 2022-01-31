package day43_Abstraction.car;

public class Honda extends Car{
    public Honda(String brand, String modedl, String color, int year, double price) {
        super(brand, modedl, color, year, price);
    }

    @Override
    public void stop() {
        System.out.println("pump the breaks");
    }

    // regular classes can not have an abstract methods
    // abstract methods can only be created either in an abstract class or in interface.


    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }
}
