package day30_CustomClass;

public class Student {

    public String name; // this is instance variable
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    // the variable in the parameter is local and it can has the same name as the instance variable
   /* public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;  // meaning that we are calling the instance variable name and not the local variable
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


    */

    // it can be done by shortcut: right click , generate, constructor, choose all then OK.
    // Then set the return type of the method void and then name the method.
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
// this. keyword is used in Java when we want to call the instance variable which shares the same name as the local variable.


    public void code(){
        System.out.println(name + " is coding");
    }
    public  void sleep (){
        System.out.println(name + " is sleeping");
    }








}
