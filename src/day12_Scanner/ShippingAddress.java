package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

    /*
    1. Enter your full name (nextLine())
    2. Enter your building number (next()) because it might have letters in it
    3. Enter your Street name (next line())
    4. Enter your city name(next line ())
    5. Enter your state (one word) (next ())
    6. Enter your country
    7. Enter your zip code (next ()) in case zip code has letters

    Display the Shipping address
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= scan.nextLine(); // Layan Alogaily

        System.out.println("Enter your building number:");
        String buildingNumber = scan.next();
        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name:");
        String stateName = scan.next();
        scan.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = scan.next();
        scan.nextLine();

        System.out.println("Enter your country name:");
        String country = scan.nextLine();
        scan. close();


        System.out.println(fullName + "\n" + buildingNumber  + "" + streetName
        + "\n" + cityName + "\n" + stateName + "\n" + zipCode + "\n" + country);











    }
}
