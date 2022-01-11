package day24_CustomMethod_Return;
// 3. Create a method that can display the name of the month based on the given number to the method=== > nameOfMonth(int number)
public class ReturnStatement2 {
    public static void main(String[] args) {


        nameOfMonth(7);
        nameOfMonth(14);
    }




    public static void nameOfMonth(int num) {
        if (num <1 || num>12) {
            System.out.println("Invalid");
            return; // so when the value in valid we can exit before executing the rest of the code!
        }

        String name= (num == 1) ? "January" : (num == 2) ? "February" : (num == 3) ? "March" : (num == 4) ? "April" :
                    (num == 5) ? "May" : (num == 6) ? "June" : (num == 7) ? "July" : (num == 8) ? "August" :
                            (num == 9) ? "September" : (num == 10) ? "October" : (num == 11) ? "November" : "December";
            System.out.println("Month's name = " + name);
        }

    }







