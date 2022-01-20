package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); will give us compile error because it is private
        // private is only accessible within the class itself.
       // private is invisible and not reachable outside the class.


    }
}
