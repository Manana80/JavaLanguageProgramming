package day37_Inheritance.day37_Inheritance_PhoneTask;
/*
1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()


 */
public class Nokia extends Phone{

    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }
}
