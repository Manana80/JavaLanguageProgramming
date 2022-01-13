package day38_Inheritance.day38_Inheritance_Car;

public class Car {
    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start () {
        System.out.println(brand + " " + model + " is starting");
    }

    public void drive (){
        System.out.println(brand + " " + model +  " is being driven");

    }






    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
