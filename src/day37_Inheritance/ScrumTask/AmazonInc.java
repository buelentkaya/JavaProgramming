package day37_Inheritance.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";
        ProductOwner po=new ProductOwner("Bülent",47,'M',"German","Product Owner",1,190000,company);
        BusinessAnalyst ba=new BusinessAnalyst("Cihad",30,'M',"German","Business Analyst",2,75000,company);
        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', "German","<scrum Master",3, 145000, company);



        Tester tester1=new Tester("Chinara",32,'F',"Englisch","QA",1415,125000,company);

        Tester tester2=new Tester("Yasaman",31,'F', "Englisch","QE",1416,130000,company);

        Tester tester3=new Tester("Irena",29,'F',"English","SDET",1417,128000,company);

        Tester tester4=new Tester("Cihad",26,'M',"English","QA",1418,125000,company);
        Tester[] testers={tester1,tester2,tester3,tester4};


        Developer developer1=new Developer("Max", 40, 'M', "English","Senior Java Developer", 3665, 180000, company);
        Developer developer2=new Developer("Allison", 18, 'F', "English","Junior Java Developer", 364, 120000, company);
        Developer developer3=new Developer("Tom", 26, 'M', "English","Java Developer", 3654, 140000, company);
        Developer developer4=new Developer("Manas", 40, 'M', "English","Full Stack Developer", 6568, 280000, company);
        Developer developer5=new Developer("Evelyn", 30, 'F', "English","JS Developer", 788, 160000, company);
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name +" : "+tester.salary);
        }

        System.out.println("------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);
        }






    }
}
