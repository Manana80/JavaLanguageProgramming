package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static block"); // will alwasys be execeuted the first and only once
    }
    public Constructor_vs_StaticBlock(){     // will always be executed after the main method is run and only when an object has been created
        System.out.println("Constructor");
    }

    public static void main(String[] args) { // runs after the static block and reads from top to bottom
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }

    // never use the main method to set the static variables becuase it can only run inside it's class (cannot run outside the class)
/*
setting up instance variables: use constructor
  setting up static variables: use static block
 */

















}
