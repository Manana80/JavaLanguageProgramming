package myPractice.throwPractice;

import java.io.IOException;

public class ThrowExample {
    void myMethod(int num)throws IOException, ClassNotFoundException{
        if (num==1){
            throw new IOException("IO Exception Occurred");
        }else {
            throw new ClassNotFoundException("Class Not Found Exception");
        }
    }


    public static void main(String[] args) {
        try{
            ThrowExample obj = new ThrowExample();
            obj.myMethod(1);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }






}
