package day45_Abstraction.Shape;

public class Cube extends Shape implements Volume{
    private double side;

    public Cube( double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side: " + side);
        }
        this.side = side;
    }

    public double area() {
        return side* side * 6;
    }

    public double perimeter() {
        return 12 * side;
    }

    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }

    public double volume() {
        return side * side * side;
    }
}
