package myPractice.CustomExceptionExample;

public class Example1 {
    void productCheck(int wieght)throws InvalidProductExcption{
        if (wieght<100){
            throw new InvalidProductExcption("Product Invalid");
        }
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        try{
            obj.productCheck(60);
        }catch (InvalidProductExcption ex){
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

    }








}
