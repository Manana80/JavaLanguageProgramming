package day30_CustomClass;

// Each object has an identity(name of object), State(attributes which are data stored in instance variables) and behavior (methods or functionalities)

    public class Car { // This is called the class constructor. It should have a similar name to the class.
        // Constructors have no return type even though they are special kind of methods.
        // All these attributes represent the State of the object(i.e. the instance of the Class)
    public String brand;    // instance
    public String model;   // instance to make sure that we have separate copies of the model
    public String color;     //
    public int year;  // different cars may have different years so that each car object can have it's own year
    public double price;


    // The following are the instance methods or (functionalities) that will represent the behavior of the object.

    public void setInfo (String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void start(){
        System.out.println("Starting " + brand + " " + model);
    }












}
