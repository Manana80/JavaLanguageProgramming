package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
this.studentName = studentName;
//schoolName = "Cydeo School"; // this is not wrong but it is inefficient
    }
static { //easier , faster and more efficient using the static block.
        schoolName = "Cydeo School";
}
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Layan");
        CydeoStudent student2 = new CydeoStudent("Elena");

    }
}