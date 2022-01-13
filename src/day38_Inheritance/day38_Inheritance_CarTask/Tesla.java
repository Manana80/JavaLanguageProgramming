package day38_Inheritance.day38_Inheritance_CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autopilot(){
        System.out.println(brand + " " + model + " is in autopilot mood" );
    }
}
