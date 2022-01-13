package day37_Inheritance.day37_Inheritance_PhoneTask;
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */
public class Phone { // parent class: only contains the common features of all the subclass
    public String brand, model, size, color;
    public double price;
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, String color, double price) { // the only one won't be inherited to child class
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static{       // the moment this class is inherited the static class will be called only once then it is gone
        hasBattery = true;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " "+ model + "is calling " + phoneNumber);

    }
    public void text(long phoneNUmber){
        System.out.println(brand + " "+ model+ "is texting " + phoneNUmber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", hasBattery= $" + hasBattery +
                '}';
    }
}
