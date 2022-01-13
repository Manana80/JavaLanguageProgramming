package day37_Inheritance.day37_Inheritance_ScrumTask;
/*
Create a class named AmazonInc:

            create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
            Create 4 objects of Testers
            Create 5 Objects of Developers

            Create an object of ScrumTeam

            Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers object into the scrum team
 */
public class AmazonInc {
    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner PO = new ProductOwner( "Suhaib", 29, 'M',1,160000,company);
        BusinessAnalyst BA = new BusinessAnalyst("Cihad",30,'M',2,150000,company);
        ScrumMaster SM = new ScrumMaster("Anel",26,'F',3,145000,company);

        Tester tester1=new Tester("Chinara",32,'F',"QA",1415,125000,company);

        Tester tester2=new Tester("Yasaman",31,'F',"SDET",1416,130000,company);

        Tester tester3=new Tester("Irena",29,'F',"SDET", 1417,128000,company);

        Tester tester4=new Tester("Ali",26,'M',"QA",1418,125000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Daniela",27,'F',"Java Developer",8,135000,company);
        Developer developer2 = new Developer("Layan",27,'F',"Java Developer",8,135000,company);

        Developer[]developers = {developer1,developer2};

        ScrumTeam scrumTeam = new ScrumTeam(PO,BA,SM);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);


        System.out.println("------------------------------------------------------------------");

        for(Tester tester: scrumTeam.testers){
            System.out.println(tester.name + " : " + tester.salary);
        }
        for(Developer developer: scrumTeam.developers){
            System.out.println(developer.name + " : " + developer.salary);
        }


    }
}
