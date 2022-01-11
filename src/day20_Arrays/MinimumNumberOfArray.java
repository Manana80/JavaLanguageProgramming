package day20_Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int[]numbers = {1,2,3,80,455,20};
        int min = numbers[0];

        // for (int i = 0; i < numbers.length;i++) is starting from index 0 and going forward
        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i]<min){
                min =numbers[i];
            }

        }

        System.out.println(min);





    }
}
