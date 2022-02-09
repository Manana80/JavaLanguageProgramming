package day45_Abstraction;

public class Extends_vs_Implements {

  // extends:
    class C{

  }
  class A{

  }
    class B extends A{ // class B cannot extend class C since multiple extending more than one class is not allowed

    }
interface Z{

    }

interface X{

}
interface Y extends X,Z{ // Interfaces are allowed to multiple inheritance from other interfaces

}
 // implements
    class D implements X,Y,Z{
        // classes can implements as many interfaces as it would
 }
 // an interface cannot extend a class (never)

   // class D implements  X,Y,Z extends C{ not allowed, classes should extend first then implements

   // }




}
