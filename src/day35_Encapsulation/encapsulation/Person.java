package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
       if(age<=0 || age >150){
           System.err.println("Invalid Age: " + age);
           System.exit(0);
       }
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

/*
as a developer
we want to control the accessing our variables
we want to control the assigning value inside the variables
we want to control which user set the variable or which user only get the variable
you can think like thi
 */


}
