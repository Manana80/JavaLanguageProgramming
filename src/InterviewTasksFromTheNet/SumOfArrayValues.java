package InterviewTasksFromTheNet;
// Write a Java program to sum values of an array and average
public class SumOfArrayValues {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};


        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        double average = sum / numbers.length;
        System.out.println(average);
        System.out.println(sum);
        System.out.println("------------------------------------------------------------");







    }
}
