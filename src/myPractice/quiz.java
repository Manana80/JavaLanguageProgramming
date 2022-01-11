package myPractice;

public class quiz {
    public static void main(String[] args) {
      String ta ="Layan";
      ta=ta.concat("Asim");
      String da= "Mohammed";
      ta = ta + da;
      ta.replace ("Mohammed","Alogaily");
      ta=ta+da;
        System.out.println(ta);
        // the result will be layan asim mohammed mohammed rather than layan asim alogaily mohammed because we haven't reassigned ta.replace to ta.
        }
       }


