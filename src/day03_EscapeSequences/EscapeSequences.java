package day03_EscapeSequences;

/*
Escape sequences: MUST be given within double quote
\n: Starts a new line
\t: Tab bottom on the keyboard i.e. Paragraph space.
\\: Single Back slash
\"

 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        // Everything written after \n will start from a new line.
        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
// Escape sequence should be printed immediately before the line we want to separate.

        System.out.println("-----------------------------------------");

        System.out.println("    Java is CoolProgramming Language"); // space can be done manually using space bar or by using \t
        System.out.println("\tJava is a cool programming language");

        System.out.println("--------------------------------------- -");

        System.out.println("/\\"); // in order to print one backward slash we have to print two backward slashes.

        System.out.println("--------------------------------------- -");

        System.out.println(" My favorite TV show is \"Game of Thrones\""); // so to gey the symbol " itself we have to use the backward slash before it.



    }


}
