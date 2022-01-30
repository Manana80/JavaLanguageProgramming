package myPractice;

public class TryAndCatchPractice {
    public static void main(String[] args) {
         try{
             int i, sum;
             sum = 10;
             for (i=-1; i<3;++i)
                 sum = (sum/i);

         }catch (ArithmeticException e ){
             System.out.println("0");
         }
       // System.out.println(sum); it will give us compilation error since sum is a local variable that has been declared
        // inside the try block( hence it won't be available outside the method it has been declared in)








    }
}
