package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        str.replace("Java","Python"); // it will create a new string object that
        // has python instead of Java
        String str2 = str.replace("Java","Python");
        System.out.println("str2 = " + str2);
        
        String email = "johnSmith@yahoo.com";
        // change the domain to gmail
        System.out.println("email = " + email);
        email =email.replace("yahoo", "gmail");
        System.out.println("email = " + email);


        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        //remove all the words Python
        System.out.println("sentence = " + sentence);
        String sentence2 = sentence.replace("Python","");
        // giving an empty string will take out all the word python


        System.out.println("sentence2 = " + sentence2);
        // we will notice that the spaces which were after pythons are still there, so we need to use the replacement method one more time to replace two spaces with one

sentence2.replace("   ","");
sentence2 = sentence2.replace("  ","");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s= s.replace("Dog","Cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool"; // we only want to replace the second one
        // so we should make it unique by assigning what is characteristic to it
        // here the second C has a space before it.
        // So by placing space C# , then the second one will be the only one which will be replaced.
       s2= s2.replace(" C#", "Java");
        System.out.println("s2 = " + s2);

        //s2 = s2.replace("C# is c", "Java is c"); to characterise the second C# (another solution)

        String s3 = "Java";
        s3=s3.replace("a","e");// all as will be replaced by es.
        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------------------");

        String result = "Java Java Java";
        //result = result.replace("Java","Python"); the print out will by python python python
        result = result.replaceFirst("Java","Python");

        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3=result3.replaceFirst("va", "vo"); // if we only add o it will replace va with o
        // because we only want to replace the second a with o then we need to add the v again.
        System.out.println("result3 = " + result3);












    }
}
