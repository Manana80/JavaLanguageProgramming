package myPractice;

public class FromElena {

    public static void main(String[] args) {
        String a = "java";
       a.toLowerCase();

        String b = "Java";
        b.toLowerCase();

        String c = new String ("Java");
        c.toLowerCase();

        if (a==b){
            System.out.println("I love Java");
        }
        else if(b==c){
            System.out.println("Hello Hello");
        }else if(c.equalsIgnoreCase(a)){
            System.out.println("-_-");
        }
    }


}
