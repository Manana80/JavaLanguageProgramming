package day38_Inheritance.day38_Inheritance_CarTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }


    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down every 100 miles");
    }
   public void  racing(){
       System.out.println( "The " + color + " " + brand + " " + model + " is a racing car");
   }

















}
