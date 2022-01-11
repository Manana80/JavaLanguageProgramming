package day28_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  //0                      // the 10 is converted to Integer automatically (autoboxing)
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4                       // the add method adds after the last index

        numbers.add(2,25);         // we can also specify the addition
        numbers.add(5,45);
        System.out.println(numbers);

        System.out.println();

        System.out.println(numbers.size());
        
        int lastIndex = numbers.size()-1; // to find the last index number
        System.out.println("lastIndex = " + lastIndex);

        int num =numbers.get(3);  // get us the object stored at the given index.
        System.out.println(num);

        System.out.println("------------------------------------------------------");

        for (int i = 0; i <numbers.size() ; i++) {  // we use the loop to get each element of the ArrayList
            System.out.println(numbers.get(i));

        }

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);

        list.set(2,"Javascript");   // set(index number, new element); replaces the element of the arrayList at given index to the new element.
        list.set(3,"C++");

        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String>groceryList=new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Tomatoes");
        groceryList.add("Eggs");
        groceryList.add("Cheese");
        groceryList.add("Sugar");

        System.out.println(groceryList);
        System.out.println(groceryList.size());
        groceryList.add(3,"Bread");
        System.out.println(groceryList);
        System.out.println(groceryList.size());
        String name = groceryList.get(3);
        // get(index); returns the element at the given index number.
        System.out.println(name);
        groceryList.set(2,"Soy Sauce");
        System.out.println(groceryList);


        //remove(int== index number) or (element); removes the element at the given index from the ArrayList. Or remove the element directlyl
        groceryList.remove(5);
        System.out.println(groceryList);
        groceryList.remove("Bread");
        System.out.println(groceryList);

        System.out.println("-----------------------------------------------------------------");

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(10);//0
        nums.add(20);//1
        nums.add(20);//2
        nums.add(30);//3
        nums.add(40);//4
        nums.add(10);//5

       int a = nums.indexOf(20); // returns the index number of the first matching element from the ArrayList, return type is int
        System.out.println(a);

        int b = nums.indexOf(10);
        System.out.println(b);

        int c = nums.lastIndexOf(10); // returns the index number of the first matching element from the ArrayList, return type is int
        System.out.println(c);

        int d = nums.lastIndexOf(20);
        System.out.println(d);














    }
}
