package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo";
        String str2 = str.repeat(4); // the argument contains the number of repetition we want
        System.out.println("str2 = " + str2); // it will be contacted 4 times

        String s1 = "Wooden Spoon ";
        String s2 = s1.repeat(100);
        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------------------");
        System.out.println("FADY\n". repeat(15)); // it can be included within the print statement


        String name = "Java";
        // System.out.println(name.repeat(5));
// if we need a space, we can do the next
        System.out.println((name+ " ").repeat(5));










    }
}
