package day47_Polymorphisim;

public  class InheritanceReview {
    int a;
    public InheritanceReview(){
        System.out.println("Parent class' constructor");
    }
    void method1(){

    }

}
class A extends InheritanceReview{

}
class Aa extends A {

}
class B extends InheritanceReview{

}
class Bb extends B{

}

class C extends InheritanceReview{

}
class Cc extends C{

}
class D{

}