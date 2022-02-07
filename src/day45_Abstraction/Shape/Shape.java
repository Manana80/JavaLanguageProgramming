package day45_Abstraction.Shape;

public abstract class Shape {
private final String name;

    public Shape(String name) {
        this.name = name;
        // or we can say this.name = getClass().getSimpleName(); another way to get the class name in the toString()
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';

    }
}
