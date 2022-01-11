package day17_While_DoWhile;
/*
Write a program that can return the frequency of the word Java from the sentence
Ex:
sentence = "JavaJavaJava";
Output: 3

* Str ="JavaJava";
Substrings:
1.Java if we start from index number 0 // substring (0,4)
2.avaJ if we start from index number 1 // Substring (1,5) // always add 4 to the last index, i.e. the length of the word
3.vaJa if we start from index number 2 // Substring (2,6)
4.aJav if we start from index number 3 // Substring (3,7)
5.Java if we start from index number 4 // Substring (4,8)


 */
public class FrequencyOfWord {
    public static void main(String[] args) {
/*
 in such tasks we should first look for how many characters does the word has,
 then create a substring from the sentence that has these characters.
 */
String str = "JavaJavaJavaJavaJavaJava";
int frequency = 0;

        for (int i = 0; i <= str.length()-4; i++) { // i: 0,1,2,3 (-4 to make sure we won't go out of index)
            // we chose 4 because it is the length of the given word. and if we use -3 then the last word will be excluded hence we should use < operator and not <=
           String eachSub=  str.substring(i,i+4); // i+4 will eventually give us error!
            // because the length is 8 and last index number is 7, so if we add 4 to 5 we get 9!!
            // hence, we have to subtract 4  in the condition to avoid this error.

            if(eachSub.equals("Java")){ // to ignore case sensitivity use equalsIgnorCase()!
                frequency++;
            }






        }


        System.out.println(frequency);







    }
}
/*
the other approach for this task is either while loop or we can delete the words one by one
str = "JavaJava"
delete 1st Java:
"Java"
delete 2nd Java:
""
we continue to delete the word and count how many times we delete it!!

 */