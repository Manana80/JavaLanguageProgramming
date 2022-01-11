package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        
        String str = "Java";
        
       // suppose we have 10 strings scattered in the code all needs to be reversed. In this case
       // we need a method that can reverse a method to do this job but also it should be reusable. hence
       // it shouldn't be void

       String result= reverse(str);
        // String result = reverse (str);     cannot be done if the return type is void!!
        System.out.println(result);
        if ( str.equalsIgnoreCase(result)){
            System.out.println(str+ " is palindrome");
        }else{
            System.out.println(str+ " is not a palindrome");
        }





    } 
    
  public static String reverse(String str)  {  // we changed void to return data type to return a value that can be used again.
        String reverse="";
      for (int i = str.length()-1; i >=0 ; i--) {
          reverse +=str.charAt(i);
          
      }
   return reverse;
  }
    
    
    
    
    
}
