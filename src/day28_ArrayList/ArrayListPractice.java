package day28_ArrayList;

import java.util.ArrayList;

/* {1,2,3,4,5,6} multiply every element by 2. output should be (2,4,6,8,10}

 */
public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }

        System.out.println(list);

        System.out.println("------------------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add ("Suat");
        employees.add ("Suhaib");
        employees.add ("Kristina");
        employees.add ("Maria");
        employees.add ("Layan");
        employees.add ("Ali");
        employees.add ("Kaloyan");

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);
        employees.remove(0);

        System.out.println(employees);

       boolean r1= employees.remove("Ali");
        System.out.println(employees);
        System.out.println(r1);  // return us whether the removal has been successful or not?

        employees.remove(employees.size()-1);
        System.out.println(employees);
    }
}
