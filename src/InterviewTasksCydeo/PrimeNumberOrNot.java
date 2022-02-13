package InterviewTasksCydeo;

/*
Write a method that can check if a number is a prime number or not
 */
public class PrimeNumberOrNot {
    public static void main(String[] args) {

        System.out.println("9 is a prime number = " + primeNumber(9));
        System.out.println("7 is a prime number  = " + primeNumber(7));
        System.out.println("3 is a prime number  = " + primeNumber(3));
        System.out.println("10 is a prime number  = " + primeNumber(10));
        System.out.println("25 is a prime number  = " + primeNumber(25));
        System.out.println("101 is a prime number  = " + primeNumber(101));

        isPrime(9);
        isPrime(2);
        isPrime(17);
        isPrime(24);
        isPrime(71);


    }


    public static void isPrime(int num) {
        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println(num + " is a prime number.");
        } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println(num + " is NOT a prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }


    }

    public static boolean primeNumber(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;

            }


        }
        return true;

    }


}
