package day32_Constructor;

public class CarpetObjects {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet(5.5, 7.5, 15, false);
        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(7.5, 10, 25, true);
        System.out.println(carpet2);

        Carpet carpet3 = new Carpet(2.5,2.5,17,false);
        System.out.println(carpet3);

        Carpet carpet4 = new Carpet(3.5,5.5,35,true);
        System.out.println(carpet4);

    }
}
