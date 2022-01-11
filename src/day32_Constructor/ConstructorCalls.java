package day32_Constructor;
/*
“A Constructor is a member function which has the same name as its class and is used to initialize the object of that
class type  with the legal initial value.”

A constructor is a special type of method that instantiates a newly created object and just after the memory allocation
 of this object takes place, the constructor is called.

The name of the constructor is the same name as that of the class and its primary job is to initialize the object
with a legal initial value for the class. It is not necessary for Java coders to write a constructor for a class.

Note: When we create an object of a class, at least one constructor is called.
If we do not write any constructor in the class then the default constructor is called.
 */
public class ConstructorCalls {

    public ConstructorCalls(){
       // this(); The constructor cannot call or contain itself (Compile Error)
        System.out.println("Default Constructor");
    }
// this constructor cannot call the constructor with int since the second one contains the default constructor. Hence , it is like this
    // constructor is inadvertently calling itself which is not allowed.

    public ConstructorCalls(int a){
        this(); // This is how we can call the default constructor (Not using it's name but using this() keyword) and it should be in the first step
        System.out.println("Constructor with int argument");

        // this(); if it was written here it will give us a compile error. (It has to be at the first step).
    }

    public ConstructorCalls(String str){
         this(10); // the constructorCalls with int arg. alraedy contains the original constructor this(). hence it shouldn't be called again
         // this (); it will give us a compile error because each constructor can only call or contain one constructor.
        System.out.println("Constructor with String argument");
    }
// This is called constructor chaining rules.


    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("---------------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("---------------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");











    }

















}
