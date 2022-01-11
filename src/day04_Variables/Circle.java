package day04_Variables;
/*
 Create a class named Circle, write a program that can calculate the diameter, area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
                            (Radius = 5.8)
 */
public class Circle {
    public static void main(String[] args) {
        // PI, radius,diameter, area, perimeter always use this note to determine what variables we are going to declare

        double PI = 3.14;
        double radius = 8.2;
        double diameter = 2 * radius; // finds the diameter by multiplying the radius by 2
        double area = radius * radius * PI; // finding the area by this formula
        double perimeter = 2 * radius * PI;

        /*
        Since all the previous data are of SAME TYPE (i.e. all are doubles), we can use a comma - separated
        list:
        Double PI = 3.14, radius = 8.2, diameter = 2 * radius, area = radius * radius* PI,
        perimeter = 2 * radius * PI;
         */

        System.out.println("radius = " + radius);
        System.out.println("pi = " + PI);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);





    }
}
