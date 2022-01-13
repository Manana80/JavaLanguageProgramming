package day38_Inheritance.day38_Inheritance_CarTask;

public class Tesla extends Car{
    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autopilot(){
        System.out.println(brand + " " + model + " is in autopilot mood" );
    }

    @Override
    void start() {
        System.out.println("Say \"start\" to start " + brand + " " + model);
    }
}



/*
IS A RELATIONSHIP one class extends another class
- Tester extends Employee
- Tiger extends Animal
- Nokia and Samsung extend Phone
HAS A RELATIONSHIP one class contains another class, but does not inherit or pass fields
- ScrumTeam has a Tester
- Zoo has a tiger
- Car has Engine
- Phone shop has Nokia and Samsung phones

 */