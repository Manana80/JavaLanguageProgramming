package day28_ArrayList;
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */
public class StrongPassword {  // this is an interview question
    public static void main(String[] args) {
        String password = "Cydeo1990@";

        boolean r1 = password.length() >=8 && !password.contains(" "); // the boolean condition for the first req.
        boolean r2 = false;   // has Upper case
        boolean r3 = false;   // has lower case
        boolean r4 = false;  // has special character
        boolean r5 = false;  // has digit
        // all these false are just  temporary values for the boolean expressions.
        // solved by loop and wrapper class methods.

       char[] chars =  password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){ // isUpperCase is a method of the Wrapper class (note:Character)
                r2 = true;
            }
            else if(Character.isLowerCase(each)){
                r3=true;
            }
            else if(Character.isDigit(each)){
                r5 = true;
            }
            else{ // special char
                r4 = true;
            }
            if (r2&&r3&&r4&&r5){
                break;   // becasue if those 4 conditions already existed there is no need to continue checking the rest of the p.w.
            }
            }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);


       
















    }
    public static boolean isStrongPassword (String password){
        boolean r1 = password.length() >=8 && !password.contains(" "); // the boolean condition for the first req.
        boolean r2 = false;   // has Upper case
        boolean r3 = false;   // has lower case
        boolean r4 = false;  // has special character
        boolean r5 = false;  // has digit
        // all these false are just  temporary values for the boolean expressions.
        // soled by loop and wrapper class methods.

        char[] chars =  password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2 = true;
            }
            else if(Character.isLowerCase(each)){
                r3=true;
            }
            else if(Character.isDigit(each)){
                r5 = true;
            }
            else{ // special char
                r4 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }




}
