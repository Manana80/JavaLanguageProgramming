package day25_CustomMethodLoading;
// Interview Question: Can the main method be overloaded.
public class MainMethodOverloading {
    public static void main(String[] args) { // this is the building Java main method and this is the one that make the program runnable.
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");

    }

    public static void main(double[] args) {
        System.out.println("double");

    }

    public static void main(char[] args) {
        System.out.println("char");

    }



















}
