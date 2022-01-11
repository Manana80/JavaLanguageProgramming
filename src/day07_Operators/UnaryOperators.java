package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25; // we can simply write it as num = 25;
        int num2 = -25; // - should be added

        //System.out.println( num1<0);// false statement
        System.out.println( num2 < 0); // true statement

        System.out.println("-------------------------");

        int a = 5;
        ++a;
        // ++a; pre increment: increases the value by 1 right away.
        System.out.println(a);

        --a; // pre decrement: decrease the value by 1 immediately.
        System.out.println(a); // the reason why the value is 5, is because it decreases the value by 1 from the previous statement.


        int b = 100;
        System.out.println(++b); // increases the value by 1 immediately.

        int c = 100;
        System.out.println(c++); // post increment if we run, it will postpone the increasing the current value, i.e. it passes the current value.
        // eventually it will increase it in the next step.
        System.out.println(c); // the result will be 101 because the previous step applied a post increment.

        // All this will be needed when covering the operator loop.

        int x = 200;

        System.out.println(--x); // pre decrement operator, it will decrease the value by 1 right the way.

        int y = 200;
        System.out.println(y--); // post decrement operator, it will pass the current value first then in the next step it will decrease the value by one.
        System.out.println(y--);
        System.out.println(y);
        System.out.println(y);

        System.out.println("----------------------------------------------------");
        int z = 45;
        System.out.println(++z); // 46
        System.out.println(z++); // 46 it will pass the current value
        System.out.println(z); // 47 next step it will increase the value by 1

        int q = 30;
        System.out.println(--q); // 29
        System.out.println(q--); // 29
        System.out.println(q); //28

        double n = 14.5;
        System.out.println(++n);
        System.out.println(n++);
        System.out.println(n);

        System.out.println("------------------------------------------------");


    }


}
