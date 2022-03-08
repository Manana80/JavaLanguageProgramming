package day50_Collections_Map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Interview Task
2. write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions

  3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order

            don't use a custome method nor create one for an interview task
            List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4));

        //solution1
        List<Integer> list1 = new ArrayList<>( new LinkedHashSet<>(list));

        //solution 2:
        List<Integer> list2 = new ArrayList<>();
        for (Integer each : list) {
            if(!list2.contains(each))
                list2.add(each);
        }

        // solution3
        List<Integer> list3 = new ArrayList<>();
        list.forEach( p -> {if(!list3.contains(p)) list3.add(p);});

 */
public class RemoveEven {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1,2,3,5,6,100,90,80,75,45,35,25,15));
      /*  set.removeIf(p -> p%2==0);
        System.out.println(set);

       */
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }
        System.out.println(set);





    }
}
