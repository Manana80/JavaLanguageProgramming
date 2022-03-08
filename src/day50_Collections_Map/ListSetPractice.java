package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5)); // the size will be 5 since duplicated elements are not accepted
        System.out.println(set);
        // list is dynamic and has many methods (better choice than array)
       // Integer [] array = set.toArray(new Integer[0]);
        // the problem with set is that we don't have access to it's element since insertion order is not preserved

        List<Integer>list = new ArrayList<>(set); // in order to get access to ALL elements of the Set
        System.out.println(list);

      //  List<String> names = null; // null means no object has been created
      //  System.out.println(names.size()); // we will get NullPointerException

        System.out.println("-------------------------------------------------------------------");
        //pop()==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars); // [A,B,C,D]
        ((Stack<Character>) chars).pop(); // downcasting
        System.out.println("chars = " + chars); // [A,B,C]

        //poll() ==> FIFO
        List<String>names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy","Kathy","Breannan","Max"));
        System.out.println(names);
        ((LinkedList<String>) names).poll();
        System.out.println(names);
        ((LinkedList<String>) names).poll();
        System.out.println(names);
        ((LinkedList<String>) names).poll();
        System.out.println(names);
     /*
     To avoid getting exceptions we can use
     if(!list.isEmpty()){
     list.pop()
      }
      */



    }
}
