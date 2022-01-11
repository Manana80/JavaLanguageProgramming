package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); will give us compile error because it is private
        // private is only accessible within the class itself.
       // private is invisible and not reachable outside the class.

AccessModifiers.method1();
AccessModifiers.method2();
//AccessModifiers.method3();  cannot be called because it is private, hence it is only visible within it's class
    }
}
