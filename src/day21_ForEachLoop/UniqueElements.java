package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Layan","Layan","Oleksandr","Adam","Olga","Adam","Cihad","Cihad","Cydeo"};

/*
        for (int j = 0; j < words.length; j++) { // outer loop selects specific word each iteration

            String element = words[j];
            int frequency = 0;

            for (int i = 0; i < words.length; i++) { // inner loop will compare the selected word to the entire array
                // i.e. founds the frequency of element from array
                if(words[i].equals(element)){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(element);
            }

        }



 */

        for (String each : words) {       // this loop to separate each element

            int count = 0;                   // this is to count how many each element appeared by comparing it to the entire elements in the array
            for (String element : words) {
                if(element.equals(each)){
                    count++;
                }

        }
        if (count==1){
            System.out.println(each);
        }



        }








    }
}
