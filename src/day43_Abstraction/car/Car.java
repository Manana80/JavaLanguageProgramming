package day43_Abstraction.car;

public abstract class Car {
    private final String brand, modedl;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String modedl, String color, int year, double price) {
        this.brand = brand;
        this.modedl = modedl;
        setColor(color);
        if(year<1886){
            throw new RuntimeException("Invalide year: "+ year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModedl() {
        return modedl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }


    public void stop (){
        System.out.println("Press the break");
    }
    public abstract void start ();


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modedl='" + modedl + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
