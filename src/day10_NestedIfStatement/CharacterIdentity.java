package day10_NestedIfStatement;
/*
/*
Create a class called Character Identity,
and write a program that can identify if the given character is a digit or Alphabetic Character
(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the characters on ASCII table
 */

public class CharacterIdentity {
 public static void main(String[] args) {
  // My solution:
  char symbol = 'L';
  boolean alphabit = symbol >=65 && symbol <=90 || symbol >= 97 &&   symbol<=122;
  boolean number = symbol >= 47 && symbol <=57;
  boolean non = symbol >=0 && symbol <=31;
  boolean spceialCharacter = !alphabit && ! number && !non;

  if(alphabit){
   System.out.println("Alphabet");
  }
  else if(number){
   System.out.println("Number");
  }
  else if(spceialCharacter){

   System.out.println("Special Character");
  }
  else {
   System.out.println("Non");
  }


  System.out.println("------------------------------------------------");

  //Muhtar's solution:
 char ch = '@';
 if (ch>= '0'&& ch<='9'){ System.out.println("Digit");}
 else if((ch >= 'A' && ch <='Z')|| (ch >='a' && ch<='z')) {System.out.println("Alphabetic");}
 else {
  System.out.println("Special Character");
 }

 }
}
