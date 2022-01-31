package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
        Honda honda = new Honda("Passport","White",2019,50000.0);

        Audi audi = new Audi("Q7","Blue",2020,45000);

        Tesla tesla = new Tesla("Model3","Silver",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------------------------------------------");

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("black");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("---------------------------------------------------------------------------");

       audi.start();
       honda.start();
       tesla.start();

    }




}
