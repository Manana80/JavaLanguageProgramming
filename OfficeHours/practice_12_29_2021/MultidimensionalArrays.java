package practice_12_29_2021;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        String [] scrum1 = {"Aysegul","Oleksandr","Timiur","Jilili"};
        String [] scrum2 = {"Ali","Olga"};
        String [] scrum3 = {"Sergei","Yuliya","Farangez"};
        String [][] scrumTeams={{"Aysegul","Oleksandr","Timiur","Jilili"},{"Ali","Olga"},{"Sergei","Yuliya","Farangez"}};

        // Also can be written this way String[][]scrumTeams={scrum1,scrum2,scrum3};

        System.out.println(Arrays.deepToString(scrumTeams));
        System.out.println(scrumTeams[1][1]);

        for (String[] eachScrum : scrumTeams) {
            System.out.println(Arrays.toString(eachScrum));

            System.out.println("========================================================");

            for (String[] eachcrum:scrumTeams){
                for (String eachName:eachcrum)
                    System.out.print(eachName+ " ");
            }
        }















    }


















}
