package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        // remove all the elements which are less than 4
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i); // index number will keep on shifiting since arraylist size is dynamic
                //it will shift and iteration will skip some element
                // Iterable will remove this conflict
                //Iterable doesn't care about index number
            }


        }
        System.out.println(list);
        System.out.println("====================================================================");

        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        // remove all the elements which are less than 4

        Iterator<Integer> it = list2.iterator();
        boolean r1 = it.hasNext(); // returns boolean , check whether there is an element eligible for removal
        // if there were no element in list 2 it will return us false
       // System.out.println(r1);
       // System.out.println(it.next()); // it corolates to the hasNext method , as long as hasNext returns ture
        // Next() will return that element
       // boolean r2 = it.hasNext();
       // System.out.println(r2);
       // System.out.println(it.next());
        // rather than repeating these stpes for all the elements , we can use while loop since it only accepts a
        // condition

        while (it.hasNext()){
           if( it.next() <4){
               it.remove();
           }
        }
        System.out.println(list2);

        System.out.println("=====================================================================");

        List<Integer>list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        for (Iterator<Integer> i = list3.iterator(); i.hasNext();) {// no iterator is needed since next method will provide us with the false condition
            if(i.next() <4){
                i.remove();
            }


    }
        System.out.println(list3);
        System.out.println("================================================================");
        List<Integer>list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list4.removeIf(each -> each <4);
}}
