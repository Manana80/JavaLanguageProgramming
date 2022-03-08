package Day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","F");
        employeeMap.put("Winfred","M");
        employeeMap.put("Jereme","M");
        employeeMap.put("Glad","F");
        employeeMap.put("Desirea","F");
        employeeMap.put("Kakalina","F");
        employeeMap.put("Bertrando","M");
        employeeMap.put("Ajay","F");
        employeeMap.put("Brigitte","F");
        employeeMap.put("Derk","M");
        employeeMap.put("Selle","F");
        employeeMap.put("Orlando","F");
        employeeMap.put("Marika","F");

        // 1. Update the "M"  to Male and "F" to Female
/* Solution 1
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("M")){
                employeeMap.replace(key,"Male");
            }else{
                employeeMap.replace(key,"Female");
            }
        }
        System.out.println("employeeMap = " + employeeMap);




 */
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) { // Entry type (inner interface of the Map)
           // System.out.println(entry);

            // EntrySet is the preferred method since it itrates both keys and values in one step so we have access to all
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
                //employeeMap.replace(entry.getKey(),"Male");      another way of solving the task
            }else{
                entry.setValue("Female");
            }
            System.out.println(entry);

        }
        System.out.println("employeeMap = " + employeeMap);

        System.out.println("-----------------------------------------------------------------------------");



        // 2. Display the names of all female employees

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey = eachPair.getKey();
            String eachValue = eachPair.getValue();
            if(eachValue.equalsIgnoreCase("female")){
                System.out.println(eachKey);
            }
        }




    }
}
