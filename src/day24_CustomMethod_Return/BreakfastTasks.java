package day24_CustomMethod_Return;

/*
1. Create a method that can display the initials of the person // initials(String firstName,String lastName )

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
6. Create a class called AgeGroups, and write a program that can define the age groups of a person

     age groups are:
         infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
         Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
         Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
         Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
         Senior Citizen (75 - 84),
         Old Senior Citizen (85+) (edited)

 */
public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Wooden", "Spoon");  // W.S
        initials("layan", "alogaily");
        System.out.println("---------------------------------------------------");
        domain("wooden_spoon@CydeoSchool.com");
        domain("layan_imec@yahoo.com");
        System.out.println("----------------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminure@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);

        }
        System.out.println("-------------------------------------------------------------");
        nameOfMonth(6);
        nameOfMonth(20);
        nameOfMonth(15);
        System.out.println("-------------------------------------------------------------");

        nameOfDay(1);
        nameOfDay(5);
        nameOfDay(9);
        System.out.println("--------------------------------------------------------------");
        daysInMonth(12);
        daysInMonth(6);
        daysInMonth(13);
        daysInMonth(2);
        System.out.println("----------------------------------------------------------------");
        ageGroups(40);
        ageGroups(2);
        ageGroups(90);



    }


    //1. Create a method that can display the initials of the person // initials(String firstName,String lastName )
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    //2. Create a method that can display the domain of the email==> domain(String email)
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("the domain is: " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method===> nameOfMonth(int number)
    public static void nameOfMonth(int num) {
        String name="";
        if (num >= 1 && num <= 12) {
           name= (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April" :
                    (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" :
                            (num == 9) ? "September" : (num == 10) ? "October" : (num == 11) ? "November" : "December";
            System.out.println("Month's name = " + name);
        } else {
            System.out.println("Invalid");
        }


    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number) {
        if(number>=1 && number<=7){
            if(number==1){
                System.out.println("Monday");
            } else if (number==2){
                System.out.println("Tuesday");
            }else if (number==3){
                System.out.println("Wednesday");
            }else if (number==4){
                System.out.println("Thursday");
            }else if (number==5){
                System.out.println("Friday");
            }else if (number==2){
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid number");
        }
    }

    //5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
        if(number>=1&&number<=12){
            switch (number) {
                case 2:
                    System.out.println("28 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }


        } else {
            System.out.println("Invalid Number");
        }

    }
    //6.ageGrous(int age)
    public static void ageGroups(int age) {
        String result = "";
        result = (age <= 120) ? (age == 1 || age == 2) ? "Infant" : (age <= 5) ? "Toddler" :
                (age <= 9) ? "Kid" : (age <= 12) ? "Pre-Teen" : (age <= 17) ? "Teenager" : (age <= 20) ?
                        "Young Adult" : (age <= 39) ? "Adult" : (age <= 49) ? "Young Middle-Aged Adult" :
                        (age <= 54) ? "Middle-Aged Adult" : (age <= 64) ? "Very Young Senior Citizen" :
                                (age <= 74) ? "Young Senior Citizen" : (age <= 84) ? "Senior Citizen" :
                                        "Old Senior Citizen" : "Invalid age!";

        System.out.println(result);


    }

    }
