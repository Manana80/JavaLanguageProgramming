package Day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
// to show when multiple people shares the maximum salary
public class MapPractice3 {
    public static void main(String[] args) {
      // Display the names of all employees who has the maximum salary
       Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
        map.put("Layan", 145000);
        map.put("Zainab", 145000);
        map.put("Jaafar", 145000);
        map.put("Mohammed", 145000);
/*
        int maxSalary = Integer.MIN_VALUE;
        for (Integer eachValue : map.values()) {
            if(eachValue>maxSalary){
                maxSalary=eachValue;

            }

        }

 */
        int maxSalary = Collections.max(map.values());  // another way to get the maximum salary
        System.out.println("maxSalary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue()==maxSalary){
                System.out.println(pair.getKey());
            }
        }










    }
}
