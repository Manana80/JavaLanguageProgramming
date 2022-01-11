package day21_ForEachLoop;

/**
 * create string array, and store the names of your  class mates (10)
 *             reverse each students names and print them in separate lines
 *             	ex:
 *             		arr = {java, python, c#}
 *
 *         		output:
 *         			avaJ
 *         			nohtyp
 *         			#c
 */




public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};



        for (String each : names) { // this outer loop gets us each of the names in the array
            String reversed="";

            for (int i = each.length()-1; i >= 0; i--) {  // this loop is always used to reverse the names

                reversed+= each.charAt(i);



            }
            System.out.println(reversed);
        }







    }
}
