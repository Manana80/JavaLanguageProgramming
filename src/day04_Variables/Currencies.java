package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        // convert $ 1000 to other currencies

        int dollar = 1000;
        double lira = dollar * 9.53;
        double euro = dollar * 0.86 ;
        // jpy, pound, peso, cad, riyal , chineseYuan
        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;
        double peso = dollar * 20.84;
        double cad = dollar * 1.24;
        double riyal = dollar * 3.75;
        double chineseYuan = dollar * 6.40;


        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);
        System.out.println("chineseYuan = " + chineseYuan);

    }
}
