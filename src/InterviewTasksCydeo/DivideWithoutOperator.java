package InterviewTasksCydeo;
/*
Write a method that can divide two numbers without using division operator
 */
public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divideWithoutDivisionOperator(6,2));
        System.out.println(divideWithoutDivisionOperator(9,1));
        System.out.println(divideWithoutDivisionOperator(100,2));
        System.out.println(divideWithoutDivisionOperator(0,4));
        System.out.println(divideWithoutDivisionOperator(90,0));

    }





    public static int divideWithoutDivisionOperator(int num1, int num2){
        if(num2==0){
           throw new RuntimeException("Invalid Entry");
        }
        int count=0;
        for(int i = num1; i>=num2; i-=num2){
            count++;
        }
        return count;
    }
}
