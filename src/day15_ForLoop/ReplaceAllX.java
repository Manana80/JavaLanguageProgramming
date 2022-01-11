package day15_ForLoop;

/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
public class ReplaceAllX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String str = "xcodeX";
        String result =str.replace("x", "a").replace("X","a");
                // this will return "acodeX"           back to back replace will return acadea
        // we can only call  methods back to back when both of them return a String.
        System.out.println(result);


/*
my solution :)
 Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine().toLowerCase().toLowerCase();
        word = word.replace('x','a');
        System.out.println(word);

 */








    }

}
