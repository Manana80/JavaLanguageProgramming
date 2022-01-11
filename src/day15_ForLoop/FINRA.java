package day15_ForLoop;
/*
write a method which print out the number form 1 - 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,
for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple
of 5 print "RA" instead of the number.
ex:
output:
 1 2 FIN 4 RA FIn
 */
public class FINRA {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if (i%15 == 0){ // 15 is 3*5
                System.out.print("FINRA ");
            }
            else if (i%3==0){
                System.out.print("FIN ");
            }
            else if (i%5==0){
                System.out.print("RA ");

            }else{
                System.out.print(i + " ");
            }

        }
        System.out.println();







    }

}
