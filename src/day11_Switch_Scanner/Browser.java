package day11_Switch_Scanner;

/*
 Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names,
         out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */
public class Browser {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";
        // local variable is the variable declared withing the method or within the block.
        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {
            if (browserName == "chrome") {
                result = "Chrome";
            } else if (browserName == "firefox") {
                result = "Firefox";
            } else if (browserName == "opera") {
                result = "Opera";
            } else if (browserName == "safari") {
                result = "Safari";
            } else {
                result = "Edge";
            }

        } else {
            result = "Invalid Browser Name";

        }


        System.out.println(result + " Browser is selected");

    }
}




