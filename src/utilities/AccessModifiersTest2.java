package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiersTest2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
      //  System.out.println(AccessModifiers.defaultData); is invisible outside the package
      //  System.out.println(AccessModifiers.privateData); is invisible outside it's class
        // only public is visible in different packages

        AccessModifiers.method1(); // the only one we can call since it is public
        // it is visible everywhere
        /*
         AccessModifiers.method2();
          AccessModifiers.method3();
          Both these methods are invisible. Default won't be visible oustside
          its package and method private is invisible outside it's class.
         */



    }
}
