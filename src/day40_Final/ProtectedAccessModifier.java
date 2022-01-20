package day40_Final;

public class ProtectedAccessModifier {
    static String name1 = "Cydeo"; // default access modifier
    // it can only be inherited to classes in the same package

    protected  static  String name2 = "Wooden Spoon"; // protected
    // it could be visible if the class is subclass (outside the package)
}
