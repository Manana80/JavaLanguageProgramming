package day03_EscapeSequences; // Package name of this class

public class Println_VS_Print2 { // class header
    public static void main(String[] args) { // main method
        System.out.println("Knock Knock.."); // first it prints knock knock, then it appends a new line.
        System.out.println("Who is this?");

        System.out.println("This is Java");
        System.out.println("-------------------------------------");

        System.out.print("Knock Knock..");// Prints knock knock.., does not append new line.
        System.out.print("Who is this?");

        System.out.print("This is Java");
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Hello Everyone?how are you all today? today we will learn Escape Sequence, and next week we will learn Variables");
        System.out.println("----------------------------------");
        System.out.print("Hello Everyone, How are you all today?");
        System.out.print("Today we will learn Escape Sequence");
        System.out.print(", and next week we will learn Variables");



    }


}
