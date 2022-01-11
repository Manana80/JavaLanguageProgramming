package day04_Variables;
/*
Create a class named Square, write a program that can calculate the area & perimeter of any
given square
                        Side = (8.5)
                        area = side * side;
                        perimeter = 4 * side
 */

public class Square {
    public static void main(String[] args) {
        //DataType variableName = Data;    variable name should always be meaningful

        double side = 8.5;    // if the side was integer say 10 and we use double then it will appear as 10.0
        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
