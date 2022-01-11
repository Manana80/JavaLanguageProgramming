package day21_ForEachLoop;

/**
 * create an array named classmates, and store 10 of your classmates' full names
 *             print the initials of each classmates in separate lines
 */
public class Initials {
    public static void main(String[] args) {
        String[] names = {"Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
        "API Testing", "Database Testing", "Manual Testing"};

        for (String each : names) {
            String intials = each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);
            System.out.println(intials);
        }
        
        
        
        
    }
}
