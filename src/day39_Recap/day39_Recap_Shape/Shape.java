package day39_Recap.day39_Recap_Shape;

public class Shape {
    private String name;  // encapsulate and create getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: means something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }


        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area (){
        return 0; // because Shape is a generic word and we do not have a formula for shape!!
    }

public double perimeter(){
        return 0;
}

    @Override
    public String toString() {
        return "Shape{" +
                " name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
