package day21_ForEachLoop;

/**
 * 3. Given the following arrays:
 * String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
 * double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
 * int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
 * <p>
 * <p>
 * 1. find out the first index number of "Gloves"
 * <p>
 * 2. find out if "iPad" is contained in the item list
 * <p>
 * 3. Print the report of each shopping item
 * name - price - #ID
 */
public class OneLoopForMultipleArrays {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};

        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
// Note that all arrays have the same lengths, hence we can use only one loop for all of them .
        // it is impossible to use for each loop to iterate more than one array.

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            Double price  = prices [i];
            int id = itemIDs[i];

            System.out.println(item+" - "+id + " - $"+ price);
        }

    }
}
