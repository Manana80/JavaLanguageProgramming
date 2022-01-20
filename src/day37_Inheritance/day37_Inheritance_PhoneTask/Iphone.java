package day37_Inheritance.day37_Inheritance_PhoneTask;
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()


 */
public final  class Iphone extends Phone { // by declaring the class as final , it cannot be extended by other classes
    // i.e. it will never be a parent
    public Iphone(String brand, String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        // when we set "Apple" it is one less code since all phones from Apple are the brand of apple. remember to take the argument brand from the IPhone constructor.
        //basically constructor set Apple for us
    }

    public final void faceTime(long phoneNumber){ // grey color means it is unnecessary because the class is already declared Final
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number:" + phoneNumber);
    }

    public final void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with " + email);
    }

}
