package day33_Statics;

public class Employee {

    public String name;
    public double salary;

    public static boolean isHuman = true;


}
// Important point to note is that static block is executed before the main method at the time of class loading.