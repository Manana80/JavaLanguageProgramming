package day34_GarbageCollection_AccessModifiers;

public class StaticMemebers {

    //variable can be static
    // method can be static
    // block can be static
    // classes also can be static

    public static int num = 100;
    public static void method(){

    }
    static {
    }
    }

 class A { // outer class should never be static
     static class B {// inner class can be static ( the only conditon is it should be nested within an outer not static class)
           public static void method1 (){

            }
        }
}

class C{
    public static void main(String[] args) {
      //  A.B.method1(); // the way to access the static class.
    }
}






/*
Can a class be static?
yes, but only if there is a nested class and if the inner class contains the static keyword.
 */




class X{

}

class Y{

}

class Z{
    static class Q{

    }
}





