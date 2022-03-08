package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
stream = temporary container for processing
 */
public class StreamPractice {
    public static void main(String[] args) {
        //distinct() the functionality is similar to set() , it will remove duplicates
        //stream() it can only contains the data from the data structure nothing else

        List<Integer>list1 = new ArrayList<>(Arrays.asList(1,1,2,2,2,2,3,3,5,4,5,4,6,6));
        System.out.println(list1);
        //list.stream().distinct(); // this method are unable to change the original data structure ==> [1,2,3,4,5]
        // hence we can collect the result as a list or as an array
       list1= list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

        int[] arr1 = {1,1,2,2,2,2,3,3,5,4,5,4,6,6}; // we cannot call stream() immediately from arr1. we need Array unitility class
        System.out.println(Arrays.toString(arr1));
        arr1 = Arrays.stream(arr1).distinct().toArray(); //toArray() to convert the new result into array
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------------------------------------------------------------------");
        //skip() it skips the number of given number of elements starting from the beginning
        List<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       list2= list2.stream().skip(5).collect(Collectors.toList()); // skip(5) means it will skip the first 5 elements
        System.out.println(list2);
        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));

        System.out.println("---------------------------------------------------------------------------------------");
        //limit() it skips the elements that are beyond the given element
        List<Integer>list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3=list3.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println(list3);
        //we can use more than method at once!


        System.out.println("---------------------------------------------------------------------------------------");
        //map() it will apply any modification to the entire data structure
        List<Integer>list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map(p-> p*10).collect(Collectors.toList());
        System.out.println(list4);

        List<String>days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        days = days.stream().map(p-> p.substring(0,3)+".").collect(Collectors.toList());
        System.out.println(days);

        System.out.println("---------------------------------------------------------------------------------------");
        //filter() it will get us specific given elements (e.g. get me only the even numbers!!)
        List<Integer>list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list5= list5.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(list5);

        System.out.println("---------------------------------------------------------------------------------------");
        //count() to find how many times the elements have appeared
        List<String>names = new ArrayList<>(Arrays.asList("Java","jaVA","JAVA","Python","Ruby"));
        long countJava = names.stream().filter(p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);

        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));

        System.out.println("---------------------------------------------------------------------------------------");
        //allMatch() it will verify whether all the elements satisfy the given condition, returns boolean.
        List<Integer>list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));
        boolean r1 =list6.stream().allMatch(p->p%2==0);
        System.out.println(r1);
        boolean r2 = list6.stream().anyMatch(p ->p >20); // if only one satisfy the condition , it will return us true
        System.out.println(r2);

        boolean r3 = list6.stream().noneMatch(p->p%3==0);
        System.out.println(r3); // it will return us false because we do have elements that are divisible by 3.











    }



}
