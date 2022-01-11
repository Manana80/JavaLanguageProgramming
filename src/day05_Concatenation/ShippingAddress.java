package day05_Concatenation;
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
Use concatenation to print the full address
 */

/*
we can declare the variables in another way (easier) this way: String name = "James King", building number = "11821B",
...etc. i.e. when all our variables are under the same data type instead of semicolon only use coma and on the last one we use semicolon.

 String lastName = "Alogaily", String firstName = "Layan", fullName = lastName + " " + firstName, streetName = "Koman Circle",
        city = "Manassas", state = "VA";
        int buildingNumber = 11006, zipCode = 20109;
 */
public class ShippingAddress {
    public static void main(String[] args) {
        String lastName = "Alogaily";
        String firstName = "Layan";
        String fullName = lastName + " " + firstName;
        int buildingNumber = 11006;
        String streetName = "Koman Circle";
        String city = "Manassas";
        String state = "VA";
        int zipCode = 20109; // some cities have characters in their zipcode hence we can use string instead.
        String shippingAdress = fullName + "\n" + buildingNumber + " " + streetName +
                "\n" + city + ", " + state + ", " + zipCode;
        // since the concatenation gave us a data that it might be used again it is better to store it in a string variable, rather than a print statement.
        System.out.println(shippingAdress);

        /* the shipping label format is:
        Full name
        building number street name
        city, stat, zipcode
         */

    }

    }

