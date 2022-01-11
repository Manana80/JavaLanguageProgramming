package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        int num = 1;
        Integer number = 2000;
        list.remove(num);   // it allows primitive as it takes it as an index number
        // remove (int index): remvoes the element at the given index from the ArrayList
        // remove (object): removes the given object from the ArrayList (first matching), and returns boolean.
        System.out.println(list);
        boolean r1= list.remove(number);    // if written as list.remove(2000) it will give us out of bound exception since any number will be taken as int == index number


        System.out.println(list);
        System.out.println(r1); // will return us false because the object 2000 is not present in this ArrayList.

        System.out.println(list.size());
        list.clear();   // removes all the objects from the ArrayList, size will be set to zero
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("-----------------------------------------------------");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        System.out.println(characters);

        // contains(element); checks if the ArrayList contains the given element, return type is boolean.

        boolean r2 = characters.contains('A');
        System.out.println(r2);

       int a= characters.indexOf('A');
       int b = characters.lastIndexOf('A');
       int c = characters.indexOf('B');
       int d = characters.lastIndexOf('B');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c + " " + d);

        boolean r3 = characters.contains('Z');
        System.out.println(r3);

        System.out.println("----------------------------------------------------------------------");

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer>list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);    //it is wrong to use == because these are two different objects in the heap memory
        // equals(list): checks if the ArrayList is equal to the given list, return type is boolean.
        System.out.println(list1.equals(list2));
        // if one element is different then it will return us false, true only when same elements in the same order.
        System.out.println("--------------------------------------------------------");
        boolean r4 = list1.isEmpty(); // checks if the ArrayList is empty (size is 0), return type is boolean.
        System.out.println("r4 = " + r4);

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer>numbers = new ArrayList<>();

        //Bulk operations: Collection type (precondition) we have to call the Arrays.asList first
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(numbers);

        System.out.println("---------------------------------------------------");

        /*
        from the internet: addAll(int index, Collection c): This method is used to add a group of elements at
        a specified position in a list.
         */

        ArrayList<String>names = new ArrayList<>(Arrays.asList("Layan","Zainab","Lameese","Misk","Mirka"));
        System.out.println(names);
        names.addAll(2,Arrays.asList("Aasim","Mohammed","Jaafar","Aymen","Haider","Ilias"));
        System.out.println(names);
        boolean x = names.addAll(2,Arrays.asList("Aasim","Mohammed","Jaafar","Aymen","Haider","Ilias"));
        System.out.println(x);



















    }

















}
