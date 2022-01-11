package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    // create a function that can calculate the grade
    //Next check the grade: 'A'===> Excellent 'B'===> Great..etc
    public static void main(String[] args) {
        String str1 = grade(95);

        if (str1.equalsIgnoreCase("A")){
            System.out.println("Excellent");
        } else if (str1.equalsIgnoreCase("B")){
            System.out.println("Great");
        }else if (str1.equalsIgnoreCase("C")){
            System.out.println("Good");
        }else if (str1.equalsIgnoreCase("D")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }




    public static String grade (int score){
       String result="";

        if(score<0||score>100){
        result = "Invalid";

        }else{ // valid scores
            result = (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
        return result;

    }
}
