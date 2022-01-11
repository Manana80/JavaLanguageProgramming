package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Ahmet", 'F');
        Student student3 = new Student("Aygun", 11);
        Student student4 = new Student("Mert", 12, 'B');
        Student student5 = new Student("Cihad", 'M', 28);
        Student student6 = new Student("Suhaib",'M',27,15);
        Student student7= new Student("Ali",'M',42,30,'A');

        System.out.println(student1==student2);
        System.out.println(student1.equals(student2)); // eventhough we have the same name, the equals method is not created in the student class.
        //therefore it will give us false. we need to create our own by inheritance (in the future).

        Student [] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));





    }
}
