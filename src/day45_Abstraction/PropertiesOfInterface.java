package day45_Abstraction;

public interface PropertiesOfInterface {
    int a = 100; // static and final by default
    static int b = 200; // final by default

    /*  public PropertiesOfInterface (int a){
          this.a = a;
      }


     */
    /*   static{
        b =100;
    }


  */
    /*  public void method1(){
        System.out.println("This is an instance method");
    }

   */

    public static void method2() {
        System.out.println("Static method");
    }

    public abstract void method3();

    public default void method4() { // default methods was introduced to interface after java 8
        System.out.println("Default method");
        // default is used to create a method with the implementation in the interface. imagine classes need this method
        // with the same implementaion (there is no need to create an abstract method) we can create a default method.
    }
}
