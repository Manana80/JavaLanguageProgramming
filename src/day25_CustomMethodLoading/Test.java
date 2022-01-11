package day25_CustomMethodLoading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        //importing the first method is not working!!
        StringUtility.printEchChar(str);
        System.out.println();

        System.out.println("------------------------");

        String s1 = "Wooden Spoon";
        String reversed = StringUtility.reverse(s1);
        System.out.println(reversed);

        System.out.println("--------------------------");

        String word = "Civic";
        boolean palindrom = StringUtility.isPalindrom(word);
        System.out.println(palindrom);

        System.out.println("----------------------------");

        String[] names = {"Anna", "java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrom(each))
                count += 1;
        }

        System.out.println(count);

        System.out.println("----------------------------------------------------------");

        String word1 = "layan";
        String word2 = "nayal";
        boolean anagram = StringUtility.isAnagram(word1, word2);
        System.out.println(anagram);

        System.out.println("----------------------------------------------------------");

        String s3 = "layan asim mohammed abaalkhailalogaily";
        String removeDuplicates = StringUtility.removeDuplicates(s3);
        System.out.println(removeDuplicates);

        System.out.println("--------------------------------------------------------------");


    }

}
