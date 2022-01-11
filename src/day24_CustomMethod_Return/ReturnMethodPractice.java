package day24_CustomMethod_Return;
/*
create a method that can find the maximum number between two numbers e.g. 100 and   200
then multiply the max number by two
 */
public class ReturnMethodPractice {
    public static void main(String[] args) {

        int maxNumber = max(100,200);
        System.out.println(maxNumber*2);

    }







public static int max (int a, int b){
       int result = 0;
        if(a>b){
           result = a;
        }
        else {
            result = b;
        }
   return result;
}











}
