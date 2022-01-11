package day08_IfStatements;

public class SingleIfStatementIntro {

    // Single if statements can be used to create a condition for ONE possible outcome

    public static void main(String[] args) {
        //Task, found weather the number is odd or even.

        int number = 300;
        // There are only two possible answers.  Single if statement is only used for one possible outcome, hence we will create two single if statements.
        // in the next class we will learn another kind of if statement to be used in such task!
        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */


        // written this way, both statements will be executed on the console. there is no condition right now to determine which one is the correct and should be displayed on the console.
        // we only need one statement to be printed.
        //Hence, we have to create a condition before executing this line of code.

        //Answer:

        boolean evenNumber = number%2 == 0;
        /*
        we can solve it by creating another boolean expression for oddNumber = number%2 !=0,
        However, this expression is not necessary since we created the expression for the
        even number then the only possible result left is not even , i.e. odd.

        boolean oddNumber = !evenNumber;
         */


        // syntax of single if statement: if ( condition) {Body of the statement}
        // NO SEMI COLUMN ;

        if (evenNumber){ // This block will only be executed when the number is even.
            System.out.println(number + " is even number");
        } // this statement body will print when the condition is true.

        if (!evenNumber){ // not even number == odd number
            System.out.println(number + " is odd number");
        }

        // give it a try with 301, 543, 500, 1222, 100.



    }
}
