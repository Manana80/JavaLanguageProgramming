package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int HourlyRate = 65;   //if we want to calculate for another employee just change the values keep everything else.
        int WeeklyHours = 45;
        int NumberOfWeeks = 52;  // 52 is the number of weeks/year

        int salary = HourlyRate * WeeklyHours * NumberOfWeeks;

        System.out.println(salary); // printing the variable manually.
        // if we use the double quotes whatever in between (string) will be displayed as it is not as a process.i.e. it will be displayed on the console as Salary not the value.
        // soutv shortcut for printing a variable
        System.out.println("WeeklyHours = " + WeeklyHours); // we can include the dollar sign in the string after the equal sign
        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("salary = $" + salary);





    }



}
