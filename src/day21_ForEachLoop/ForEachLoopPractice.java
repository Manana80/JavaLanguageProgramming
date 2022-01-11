package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        // write a program that will return the initials of the first name and last in the array
        String [] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};


        for(String each:words){
            //System.out.println(each.charAt(0)+each.charAt(each.length()-1)); // this will be addition
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1)); // now concatenation
        }
    }
}
