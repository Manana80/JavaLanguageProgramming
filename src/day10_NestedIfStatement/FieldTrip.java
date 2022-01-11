package day10_NestedIfStatement;

public class FieldTrip {
    public static void main(String[] args) {
        // My solution

        int grade = 2;


        if (grade==1){
            System.out.println(" grade - 1" + "\n location - Apple orchard" + "\n number of groups - 3"
                    + "\n teacher in charge - Ms. Smith");
        }
        else if (grade == 2 ){
            System.out.println(" grade - 2" + "\n location - Zoo" + "\n number of groups - 7"
                    + "\n teacher in charge - Mr. Lee");
        }
        else if (grade == 3 ){
            System.out.println(" grade - 3" + "\n location - Aquarium" + "\n number of groups - 5"
                    + "\n teacher in charge - Ms. Wilson");
        }
        else if (grade == 4 ){
            System.out.println(" grade - 4" + "\n location - Movie theater" + "\n number of groups - 2"
                    + "\n teacher in charge - Ms. Reyes");
        }
        else if (grade == 5 ){
            System.out.println(" grade - 5" + "\n location - Museum" + "\n number of groups - 5"
                    + "\n teacher in charge - Ms. Lela");
        }
        else if (grade == 6 ){
            System.out.println(" grade - 6" + "\n location - Six Flags" + "\n number of groups - 8"
                    + "\n teacher in charge - Mr. Watt");
        }


        System.out.println("--------------------------------------------------");
        // Muhtar's solution:
        // we have 6 possible outputs
        // we will solve it with nested if

        int gradE = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if (gradE >=1 && gradE<=6){
         if (gradE==1){location = "Apple orchard";
             groupNumber = 3;
             teacher = "Ms. Smith";}
            else if (gradE == 2) {location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";}
         else if (gradE == 3) {location = "Aquarium";
             groupNumber = 5;
             teacher = "Ms. Wilson";}
         else if (gradE == 4) {location = "Movie Theater";
             groupNumber = 2;
             teacher = "Ms. Reyes";}
         else if (gradE == 5) {location = "Museum";
             groupNumber = 5;
             teacher = "Ms.Lela";}
         else {location = "Six Flag";
             groupNumber = 8;
             teacher = "Mr. Watt";}

            System.out.println(" Grade - "+ gradE  + "\n Location - "+ location + "\n number of groups - " + groupNumber
            + "\n teacher in charge - "+ teacher);














        }
        else {
            System.out.println("Invalid Grade");
        }





    }
}
