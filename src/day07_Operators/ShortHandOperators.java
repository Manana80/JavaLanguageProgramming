package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // in Java assignment operator : =
        // in math it means equal

        int number = 100; // the = means we are assigning the value 100 to the variable number.
        // it doesn't mean that the number equals 100!

        System.out.println("number = " + number); //100

        number = 200; // This is an update on the value which falls within the same variable.
        // we can just write it this way rather than declaring a new variable!

        System.out.println("number = " + number); //200
        // Remember java reads from top to bottom. i.e. whatever we assigned last will be read on the console.

        String word = "Java Programming";
        System.out.println("word = " + word); // Java Programming
        // in order to update the variable, call the variable and just update the value.
        // no need to create new variable.
        word = "Wooden Spoon";
        System.out.println( "word = " + word);

        // Therefore, this assignment operator is used to update the value that the variable contains.

        //Reassigning
        word = "Cydeo";
        System.out.println("word = "+ word);

        // in order to get the original value back we have to re-assign it to the variable word.
        // a variable can only contain one data at the time (regular variables).
        // "" are always reserved for string of text

        word = "Java Programming";
        System.out.println("word = "+ word);

        System.out.println("---------------------------------------------------");

        //Addition Assignment Operator:it will help us increase the value of the variable by specific number

        int x = 100;
        System.out.println( "x = " + x);
        //suppose we need to increase the value of x by 200
        // if I initialize a new print statement with adding +200 we won't be able to reassign the original value to the same variable!1
        // in this case we won't lose the original value of x.


        x+= 200; // This is an addtion assignment which can also be written as x = x +200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += "Spoon"; // be careful no space between + and =
        // In this case the + acted as concatenation.
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num 1 = " + num1); //2.5
        num1 +=5.5;
        System.out.println("num 1 = " + num1);

        double availableBalance = 1000.50;
        System.out.println("available balance = " + "$"+availableBalance);

        //deposit 300$
        availableBalance +=300;

        System.out.println("available balance = " + "$"+availableBalance);

        System.out.println("--------------------------------------");
        // withdrawing $500
        // so the number will go down, then we should change the original value by a certain amount

        availableBalance -= 500; // available balance = 1300.5 - 500
        // notice the last amount assigned to available balance not the initial one we applied.
        //Because Java will read the last value of that variable.

        System.out.println("available balance = " + "$"+availableBalance);

        // withdrawing 200$, then depositing 400$

        availableBalance -= 200; // available balance = 600.5
        availableBalance += 400; // available balance = 1000.5

        //We didn't need to print a new statement after withdrawing 200, it is already calculated.

        System.out.println("available balance = " + "$"+availableBalance);

        System.out.println("-----------------------------------------------");

        double salary = 50000.50;
        // after graduation from cydeo it will be double


        System.out.println("Salary =" + salary);
        salary *= 2;
        // This is called multiplication assignment

        System.out.println("Salary =" + salary);

        double doge = 0.00000001;
        System.out.println("doge = " + doge);
//        doge *= 1000000;  we can also write doge = doge * 1000000 but the previous is shorter
        System.out.println("doge = " + doge);

        System.out.println("----------------------------------------------------");

        double num2 = 25000;
        System.out.println("num2 = " + num2);
        num2 /= 2; // also can be written as num2 = num2 / 2
        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------------------------");

        // Remainder assignment %=

        double num3 = 100; // the only scenario where we will be using this operator is when we want to assign the remainder to the variable.
        System.out.println("num3 = " + num3);
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("-------------------------------------------");

        int amount = 127; // cents (we need to return this change to a customer)
        int quarters = amount/25;
        int cents = amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("--------------------------------------------------");
        int cents2 = 127;
        cents2 %=25;

        System.out.println("cents2 = " + cents2);

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);

        System.out.println("----------------------------------------------------------");

        // Let's say we have a balance of $3500. The car insurance fees are $153. How much will be left off?

        int balance = 3500;
        // insurance fee: $153

        balance %= 153;
        System.out.println("balance = " + balance);

        // the only operator that can be used with both numerical and non-numerical values is the += as it will concatenate the two strings.




    }
}
