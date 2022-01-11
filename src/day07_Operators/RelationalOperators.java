package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=
        // They all return true or false statement hence they are used for Boolean variable.

        boolean resutl1 = 200 >40; // True
        System.out.println("resutl1 = " + resutl1);

        boolean result2 = 300 >= 150; // True
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // True
        // Only one condition need to be true.
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; // False
        // Neither condition is true.
        System.out.println("result4 = " + result4);

        // you are trying to apply for a loan. Requirement in order to be eligible credit score is 720 or more.
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;
        // because 720 is included that's why we use greater or equal and not only greater than.
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120; // True
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // False
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <=59; // True (condition for student to pass should have same or more than 59)
        System.out.println("has failed = " + hasFailed);

        boolean result7 = 45 <= 60; // True
        System.out.println("result7 = " + result7);

        // all previous ones are only used for numerical values. NOT for strings

        System.out.println("--------------------------------------------------------------");

        int x = 100;
        int y = 200;
        boolean equal = x==y; // if we use one = operator, it is assigning a value not used for comparison!
        // 100 == 200 False
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; // false because the two strings are not equal
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'== 'a'; // false , they are not the same symbols.
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);

        boolean result11 = "java" == "Java"; // false because Java is a case-sensitive language
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" == " Java"; // False, because there is a space, which is an extra character.
        System.out.println("result12 = " + result12);
        // This is how replit checks out answers!!
        // example: "Hello World" == "hello world"; flase

        boolean result13 = 100 != 200; // true // when comparing two values, they should be of the same type
        // i.e. number compared to number and text to text. Not text to number and vise versa.
        // != not equal.

        System.out.println("result13 = " + result13);

        boolean result14 = "Java" != "Break"; // true
        System.out.println("result14 = " + result14);

        boolean result15 = 300 != 300; // false
        System.out.println("result15 = " + result15);

        // All these are important for if statements ( Conditional statement)





















    }
}
