package day43_Abstraction.car;

public class Honda extends Car{
    public Honda( String modedl, String color, int year, double price) {
        super("Honda", modedl, color, year, price);
    }



    // regular classes can not have an abstract methods
    // abstract methods can only be created either in an abstract class or in interface.


    @Override
    public void start() {
        System.out.println("Twist the key to ignition");
    }
}
