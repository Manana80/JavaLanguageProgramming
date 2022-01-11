package day20_Arrays;



public class AverageNumbersOfArrays {
    public static void main(String[] args) {
       int[]numbers = {10,20,30,40,50,60};
       int sum = 0; // 10+20+30..

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber= sum/numbers.length;
// 10/3 ===> in java we get 3
        System.out.println("averageNumber = " + averageNumber);









    }
}
