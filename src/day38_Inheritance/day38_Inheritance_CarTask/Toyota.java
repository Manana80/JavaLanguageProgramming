package day38_Inheritance.day38_Inheritance_CarTask;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void   reliable(){
        System.out.println( brand + " " + model + " is relaiable");
    }



    @Override // if we give this annotation and doesn't give compile error means it is overridden method. it is optional to give the annotation
    public void start(){ // we can either give protected, default or public
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }














}
