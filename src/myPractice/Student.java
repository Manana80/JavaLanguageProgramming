package myPractice;

 class Student {
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", age=" + age +
                ", onProbation=" + onProbation +
                '}';
    }
}
