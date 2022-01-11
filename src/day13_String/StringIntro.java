package day13_String;
import java.lang.String; /* it is not mandatory to import this class.
 The lang package is special, because it is imported implicitly by the compiler.
 So, any class from this package (lang) is implicitly (4automatically) done.
 However, for any other classes that are from other packages. e.g. scanner from util package,
 must be imported manually (explicitly).
*/
public class StringIntro {
    public static void main(String[] args) {

        String name = "Wooden Spoon"; // wooden spoon is an object and it is stored in java heap (memory)
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";
        String name5 = "wooden Spoon";

        System.out.println(name == name2); //true
        System.out.println(name2 == name3);//true
        System.out.println(name3 == name4);// true
        System.out.println(name5 == name2);// false

        System.out.println("--------------------------------------");
        String str = new String();

        String str1 = new String("Wooden Spoon");
        String str2 = new String( "Wooden Spoon");
        String str3 = new String( "Wooden Spoon");
        String str4 = new String( "Wooden Spoon");

        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // false
        System.out.println(str3== str4); // false

        System.out.println("-------------------------------------------");
        String s1 = "Java";
        String s2 = new String ("Java");
        System.out.println(s1.equals(s2)); // true

        String s3 = "Java";
        String s4 = new String( "java");
        System.out.println(s3.equals(s4)); //false

// if they have the same sequence of characters then it would just create one object "Java" in String pool






    }
}
