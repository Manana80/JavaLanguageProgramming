package day04_Variables;
/* Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length (10)
                        width (5)

                        area = length * width
                        perimeter =  2 * (length + width)

 */

public class Rectangle {
    // length, width, area, perimeter

    public static void main(String[] args) {
        double length = 10;              // we used double just to practice in this case we can use either int or double.
        double width = 5;
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }
}
