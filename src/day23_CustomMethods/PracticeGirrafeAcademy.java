package day23_CustomMethods;

public class PracticeGirrafeAcademy {
    public static void main(String[] args) {

        SayHi("Layan");
        SayHi("Aymen");
        SayHi("Misk");

        int cubic = cube(5);
        System.out.println(cubic);

        double cubic1 = cube(3.5);
        System.out.println(cubic + cubic1);


        elegibleToVote(17,false);
        elegibleToVote(18,true);

       String reversed= reverse("Layan");
        System.out.println(reversed );
        System.out.println(reverse("Aymen"));
        System.out.println(isPalindrome("level"));

    }


    public static void SayHi(String name) {
        System.out.println("Hello " + name);
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static double cube(double number) {
        return number * number * number;
    }

    public static void elegibleToVote(int age, boolean isUSCitizen){
        if (age>=18 && isUSCitizen==true){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("not eligible to vote");

        }

    }

    public static String reverse (String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            reverse+=""+ch;
        }
        return reverse;
    }

    public static boolean isPalindrome (String str){
       String reversed = reverse(str);
return reversed.equalsIgnoreCase(str);
    }






}


