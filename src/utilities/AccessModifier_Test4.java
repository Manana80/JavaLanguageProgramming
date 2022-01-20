package utilities;

import day40_Final.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
      //  System.out.println(AccessModifier_Test4.name1); still default is invisible
        System.out.println(AccessModifier_Test4.name2); // protected is visible in subclasses outside the package


//AccessModifier_Test4.method1(); cannot be visible outside the class
AccessModifier_Test4.method2();





    }
}
