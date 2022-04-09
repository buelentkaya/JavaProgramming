package day31Constructer.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1=new Tester("Bulent",123456789,"SDET",71000);
        Tester tester2=new Tester("Ihsan",321654987,"QA",70000);
        Tester tester3=new Tester("Busra",852147963,"QA",75000);
        Tester tester4=new Tester("Jack",8974562,"SDET",45000);
        Tester[] testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",321654,"Java Devop",125000);
        Developer developer2=new Developer("Aygun",654123,"Java Master",185000);
        Developer developer3=new Developer("Tunc",987456,"Software Developer",135000);
        Developer developer4=new Developer("Fatih",9512357,"Senior Developer",200000);
        Developer[] developers={developer3,developer3,developer4};

        ScrumTeam scrum=new ScrumTeam("NIgara","Huseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("...........................................");
        for(Tester eachTester:scrum.testerList){
            System.out.println(eachTester.name+" " +eachTester.Salary);
        }
        System.out.println("...........................................");
        for (Developer eachDeveloper : scrum.developsList) {
            System.out.println(eachDeveloper.name+" "+eachDeveloper.Salary);
        }
        System.out.println("...........................................");
        scrum.removeTester(8974562);
        scrum.removeDeveloper(321654);
        System.out.println(scrum);











    }
}
