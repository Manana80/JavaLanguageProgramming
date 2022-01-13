package day38_Inheritance.day38_Inheritance_CarTask;
/*
carTask:
    Create a class called Car
        instance variables:
            brand, model, year, price, color, miles

            add a constructor to set all the fields

        instance methods:
            start(), drive(),toString()

    Create the following sub classes of Car:
        1. Toyota:
                extra methods:
                    reliable()

        2. BMW:
                extra methods:
                    breaksDown()
                    racing()

        3. Tesla:
                extra methods:
                    autoPilot();

 */

public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    void start () { //default access modifier
        System.out.println(brand + " " + model + " is starting");
    }

     void drive (){
        System.out.println(brand + " " + model +  " is being driven");

    }
// remember parent class should always contain only the common features






}
