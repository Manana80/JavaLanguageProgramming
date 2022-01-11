package day24_CustomMethod_Return;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {

      // Find out unique characters from a string

String str = "aabccdee";
int frequency = frequency(str,'a');

        for (int i = 0; i <str.length() ; i++) { // to do it for every single ccc in the string
            frequency = frequency(str,str.charAt(i));
            if(frequency==1){
                System.out.println(str.charAt(i));
            }

        }


    }









////                              "aaa"       'a'
public static int frequency (String str, char ch){
int count = 0;
for (char each: str.toCharArray()){
    if (each==ch){
        count++;
    }
}

return count;

}








}
