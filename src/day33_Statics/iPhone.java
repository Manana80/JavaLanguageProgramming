package day33_Statics;

public class iPhone {

    public static String brand= "Apple";
    public String model;
    public double price;

    public static String OS = "IOS";        // OS operating system

    public String color;

    public String size;

    public static String madeIn = "China";
    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasCamera = true;

    public static boolean faceTime = true;

    public void printModelAndPrice(){ // if it was static it will give us compile error since the variables are instance
        System.out.println(model + " : "+ price);
    }

    public static void printOperatingSystem(){
        System.out.println(OS);  // advantages: less memory, no need to create an object just call it through the class name
    }







}
