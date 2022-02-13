package InterviewTasksCydeo;

public class Numbers_OddAndEven {
    /*
    Write a method which can identifies a given number is odd or even
    Ex:
    identify (5) -> "Odd"
    identify (6) -> "Even"
     */
    public static void main(String[] args) {

        System.out.println(oddOrEven(8));
        System.out.println(oddOrEven(3));
        System.out.println( oddOrEven(-10));
        System.out.println(oddOrEven(-9));
        System.out.println(oddOrEven(0));




    }





    public static String oddOrEven(int number){
        if(number%2==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
