package day43_Abstraction.car;

public final class Audi extends Car{
    public Audi( String modedl, String color, int year, double price) {
        super("Audi", modedl, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModedl() + " has auto park feature");
    }

}
