package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
       // p1.name = "Danial"; error because it is private
        // p1.age = 28;
        p1.setName("Daniel");
        p1.setAge(45);

       // System.out.println(p1.name = " : "+ p1.age);
        System.out.println(p1.getName()+ " : " + p1.getAge());

















    }
}
