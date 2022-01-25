package day41_Exceptions;

import day39_Recap.day39_Recap_CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;

        System.out.println("The test has been started");


        try{
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ // when all our catch blocks fail to catch the excption then as a guarntee is the runtime expcltion
            // which is the parent ....> precondition it should always be in the last block
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

        System.out.println("--------------------------------------------------------------------");


        try {
            System.out.println("java".charAt(-1));
        }catch (Exception e){ // used for both checked and unchecked excption
            e.printStackTrace();
        }



    }
}
