package day43_Abstraction.car;

public class Tesla extends Car{
    public Tesla( String modedl, String color, int year, double price) {
        super("Tesla", modedl, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" ");
    }
    public void autoPilot(){
        System.out.println(getBrand() + " " + getModedl() + "has auto pilot feature");
    }
}
