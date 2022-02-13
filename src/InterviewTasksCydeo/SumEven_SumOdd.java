package InterviewTasksCydeo;
/*
Write a method that counts the sum of odd and even number in the given array.
 */
public class SumEven_SumOdd {
    public static void main(String[] args) {
        int[]arr = {2,4,5,6,7,9,10,20,4,3,7};
        sumEvenSumOdd(arr);



    }



    public static void sumEvenSumOdd(int[]arr){
        int sumEven = 0;
        int sumOdd =0;

        for (int each : arr) {
            if(each%2==0){
                sumEven+=each;
        }else{
                sumOdd+=each;
            }

        }
        System.out.println("Sum of Even numbers = "+ sumEven + " " + "Sum of Odd numbers = "+ sumOdd);
    }








}
