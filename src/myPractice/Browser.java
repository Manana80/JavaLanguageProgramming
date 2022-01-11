package myPractice;
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

        String browserName = "Edge bateekh";
        switch(browserName){
            case"Chrome": browserName= "Chrome";
                System.out.println(browserName);
                break;
            case"Fire Fox": browserName= "Fire Fox";
                System.out.println(browserName);
                break;
            case"Opera": browserName= "Opera";
                System.out.println(browserName);
                break;
            case"Safari": browserName = "Safari";
                System.out.println(browserName);
                break;
            case"Edge": browserName = "Edge";
                System.out.println(browserName);
                break;
            default:
                System.out.println("Invalid browser");
        }









    }
}
