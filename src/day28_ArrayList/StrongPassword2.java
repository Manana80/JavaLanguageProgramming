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
public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countSpecial=0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            }
            else if (Character.isLowerCase(each)){
                countLowerCase++;
            }
            else if (Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecial++;
            }
        }
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigit>0;
        boolean hasSpecial = countSpecial>0;
     //   boolean strongPassword = password.length()>=8 && !password.contains(" ") && hasDigit && hasSpecial && hasLowerCase && hasUpperCase;


        // solution using nested if:
        boolean strongPassword=false;
if(password.length()>=8){
    if(! password.contains(" ")){
        if (hasUpperCase){
            if(hasLowerCase){
                if(hasDigit){
                    if(hasSpecial);
                }
            }
        }
    }
}
        System.out.println("strongPassword = " + strongPassword);









    }
}
