package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.setInfo("Layan",'F',41,5665,"SDET",170000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Kristina",'F',41,5675,"Scrum Master",180000,true);

        Employee employee3 = new Employee();
        employee3.setInfo("Aymen",'M',44,5865,"Project Manager",250000,false);

        Employee employee4 = new Employee();
        employee4.setInfo("Mohammed",'M',36,5661,"CryptoInvestigator",165000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Misk",'F',1,5611,"Spoiled Granddaughter",500000,false);
        
        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        
        int count = 0;
        int countPartTime=0;

        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee each : employees) {
            if(each.isFullTime==true){
                count ++;
            }
            else{
                countPartTime++;
            }
            if (each.salary >max){
                max = each.salary;
            }
            if (each.salary <min){
                min = each.salary;
            }
        }
        System.out.println("Full time employee = " + count);
        System.out.println("Part time employee = "+ countPartTime);
        System.out.println("minimum salary = " + min);
        System.out.println("maximum salary = " + max);






        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
