package day39_Recap.day39_Recap_CydeoTask;
/*
CydeoTask:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()


 */
public class Person {
    private String name;
    private  int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) { // add some conditions later on
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
       setName(name);
        setAge(age);
        setGender(gender);
    }



    public void eat(){
        System.out.println(getName() + " is eating"); // why it is not getName?I corrected it. It was Name (why it didn't give error?)
    }
    public void drink (){
        System.out.println(getName() + " is drinking");
    }
    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }










}
