package day37_Inheritance_PhoneTask;
/*
1.5 Create a class named Phone Objects and test of the sub class' objects
 */
public class PhoneShop {
    public static void main(String[] args) {
       Iphone iphone = new Iphone("Iphone12" , "ProMax", "Large", "Balck", 1000);
        System.out.println(iphone);
        iphone.call(7146286409l);
        iphone.text(7146286409l);
        iphone.faceTime(7146286409l);
        iphone.faceTime("layanimec@gmail.com");


       Samsung samsung = new Samsung("Samsung","Galaxy S21 Ultra","Large","Black",1100);
        System.out.println(samsung);
        samsung.call(7146286409l);
        samsung.text(7146286409l);
        samsung.freeze();

       Nokia nokia = new Nokia("Brick","4 inches","Grey",50);
        System.out.println(nokia);
        nokia.selfDefense();
        nokia.call(7146286409l);

        System.out.println("---------------------------------------------------------------");
        // Static variables are also inherited , just call the parent or child class and call the method or variable name;
        System.out.println(Phone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Nokia.hasBattery);
    }
}
