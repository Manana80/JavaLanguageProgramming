package day32_Constructor;

public class Test {

  public Test(){     //A
      System.out.println("A");
  }
    public Test (int a){  //AB
      this();
        System.out.println("B");
    }
    public Test (double a){ // ABC
      this(10);
        System.out.println("C");
    }
    public Test (String str){  //ABCD
      this (2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {

      new Test ("Java");
        System.out.println("-----------------------------------------");
      new Test (5.7);
        System.out.println("-----------------------------------------");
        new Test (4);
        System.out.println("-----------------------------------------");
        new Test ();












    }
















}
