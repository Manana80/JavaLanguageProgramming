package day04_Variables;
/* Create a class named EmployeeInfo.declare the following variables:
1. name (String)
2. age  (Int.)
3. gender (Char)
4. company (String)
5. job title (String)
6. yearsOf Experience (double)
7. Salary (Int)
8. is he full time (boolean)
9. Is he married (Boolean)
10. EmployeeID (string) or int if the ID contains only numbers
11. SSN (String)
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "John Allan";
        int age = 35;
        char gender = 'M';
        String company = "Google Inc";
        String jobTitle = "SDET Engineer";
        double yearsOfExperience = 7.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "J765-889-90";
        String snn = "(223-553-8907)";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("snn = " + snn);
    }
}
