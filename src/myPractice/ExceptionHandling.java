package myPractice;

public class ExceptionHandling {
    public static void main(String args[])
    {
        try
        {
            int i, sum;
            sum = 10;
            for (i = -1; i < 3 ;++i)
            {
                sum = (sum / i);
                System.out.print(i);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.print("0");
        }
    }
}
/*
Explanation: For the 1st iteration -1 is displayed. The 2nd exception is caught in catch block and 0 is displayed.

 */