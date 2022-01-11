package practice_12_22_2021;

public class Unit2Assessment_IfElse {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");    // when the word is not included in the string the index number will be -1
        if (index1 == index2) {
            System.out.println(index1);
        } else {
            System.out.println(index2);
        }

        System.out.println("-------------------------------------------------------------");
// note to self: 2%3==2        the leftover is 2 because it doesn't even get divided
        System.out.println(2 % 3);

        System.out.println("-----------------------------------------------------------------");

        String str = "The whole time ist was raining";
        do {
            System.out.print((str.charAt(0)));
        str = str.substring(3);
    }while (!str.isEmpty());

    }
}