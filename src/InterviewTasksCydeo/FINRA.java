package InterviewTasksCydeo;
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3 print "FIN"
instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
for numbers which are a multiple of both 3 and 5,print "FINRA" instead of the number.

 */
public class FINRA {
    public static void main(String[] args) {
       FINRA(1,100);
    }




    public static void FINRA (int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            if (i%3==0 && i%5!=0){
                System.out.print(" FIN " + " " );
            }else if(i%5==0 && i%3!=0){
                System.out.print(" RA " + " ");
            }else if (i%3==0 && i%5==0){
                System.out.print(" FINRA " + " ");
            }else{
                System.out.print(i + " ");
            }

        }

    }
}
