package day37_Inheritance.day37_Inheritance_PhoneTask;
/*
	1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()



 */
public class Samsung extends Phone{
    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void freeze(){
        System.out.println(brand + " doesn't freeze at all");
    }
}
