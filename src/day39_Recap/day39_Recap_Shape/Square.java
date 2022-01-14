package day39_Recap.day39_Recap_Shape;

public class Square extends Shape{
   private double side;



    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid side: " + side);
            System.exit(1);
        }



        this.side = side;
    }
    public Square( double side) {
        super("Square");
        setSide(side); // to make sure that the data given matches the condition.
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
