package Day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String,Integer>students = new HashMap<>();
        students.put("Aygun",85);
        students.put("Maria",86);
        students.put("Layan",100);
        students.put("Serkan",97);
        students.put("Ali",95);
        students.put("Kristina",95);
        students.put("Ali",75);
        students.put("Ali",89);
        students.put("Zainab",100);

        //ketSet() it will get us all the keys from the map
        // it returns the keys as a set since it is unique and doesnt' accept duplicates just like the map

      /*  Set<String> keys = students.keySet();
        for (String eachKey : keys) {    // this is how we can get each key
          //  System.out.println(eachKey + " : " + students.get(eachKey));
            //students.get(eachKey) to get the value of each key
            students.replace(eachKey,students.get(eachKey) + 5); // how to change the value of keys



        }


       */
        System.out.println(students);
        Map<String,Integer> earlyBirds = new HashMap<>();
        Map<String,Integer>angryBirds = new HashMap<>();
        for (String key : students.keySet()){
            Integer value = students.get(key);
            if(value >=90){
                earlyBirds.put(key,value);
            }else
                angryBirds.put(key,value);
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String>names = students.keySet();


        // remove all the students whose score is less than 90
        for (String eachKey : students.keySet()){
            Integer eachValue = students.get(eachKey);
            if(eachValue <90){
                System.out.println(eachKey);

            }
        }

        System.out.println("-------------------------------------------------------------------");

        //Collection<Integer>scores = students.values();
        List<Integer> scores = new ArrayList<>( students.values() );
        System.out.println(scores);

        for (Integer eachValue : students.values()) {
            System.out.println(eachValue);
        }
        System.out.println("---------------------------------------------------------------------------");
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score>maxScore){   // when we are not allowed in the interview to use the ready max() and min() from Collections
                maxScore=score;
            }
            if(score<minScore){
                minScore=score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("-------------------------------------------------------------------");
        int max = Collections.max(students.values()); // if in the interveiw we were allowed to use the max() from Collections
        int min = Collections.min(students.values());
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------------------------");
        // how many students has the score of 95 or greater
        int count = 0;
        for (Integer eachScore : students.values()) {
            if(eachScore>=95){
                count++;
            }

        }
        System.out.println("count = " + count);

        System.out.println("-------------------------------------------------------");
        // remvoe if cannot be applied to map since mas has no realationship with neither iterable or collection

        for (Map.Entry<String,Integer> entry : students.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()); // this will only return us the the names
            System.out.println(entry.getValue());
        }





        /*
         if (eachValue <90){
                students.remove(eachKey);
         */














    }
}
