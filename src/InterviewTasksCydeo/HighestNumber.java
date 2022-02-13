package InterviewTasksCydeo;
/*
Write a method that finds the highest number in an Array
 */
public class HighestNumber {
    public static void main(String[] args) {
        int[]arr = {2,5,9,100,-3,0};
        int highestNumber= highestNumber(arr);
        System.out.println("The highest number in the array is: " + highestNumber);
    }



public static int highestNumber(int[]arr){
    int highestNumber = arr[0];
    for (int each : arr) {
        if(each>highestNumber){
            highestNumber=each;
        }
    }
    return highestNumber;
}

/* public static int Highest (int[]arr){                This solution is provided by the school
int highest = Integer.MIN_VALUE;
for (int i = 0; i<arr.length;i++){
if(arr[i]>highest){
highest = arr[i];
}
}
return highest;
 */
}
