package InterviewTasksFromTheNet;

public class DuplicatesInArray {
    public static void main(String[] args) {


     // how to find duplicates in an array

     String [] strArray1 = {"defi","abc1","defi","mon1","xyz1","qpr1","xyz1"};
        for (int i = 0; i < strArray1.length; i++) {
            for (int j = i+1; j < strArray1.length; j++) { // i+1 so that the first element picked by the outer loop will be checked to the rest after it.
                if(strArray1[i].equals(strArray1[j]) && i!=j){
                    System.out.println("Duplicates: "+strArray1[j]);
                }

            }

        }










    }
}
