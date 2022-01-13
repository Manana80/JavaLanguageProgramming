package day38_Inheritance.day38_Inheritance_CarTask;

public class BMW extends Car{
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }


    public void breaksDown(){
        System.out.println("breaks down");
    }
   public void  racing(){
       System.out.println( "The " + color + " " + brand + " " + model + " is racing");
   }

















}
