package day36_InheritenceOOP.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner PO=new ProductOwner();

       PO.setInfo("Bulent",47,'M',1,"Product Owner",company,125000);
       ScrumMaster SM =new ScrumMaster();
       SM.setInfo("Anel",26,'F',3,"Scrum MAster",company,85000);
       BusinessAnalyst BA=new BusinessAnalyst();
       BA.setInfo("Bera",27,'M',7,"BusinessAnalyst",company,95000);

       Tester tester1=new Tester();
        tester1.setInfo("Ahmet",28,'M',6,"QA",company,75000);
        Tester tester2 = new Tester();
        tester2.setInfo("Ayshe",48,'F',16,"QA",company,75000);
        Tester tester3 = new Tester();
        tester3.setInfo("Osman",38,'M',61,"QA",company,75000);
        Tester tester4 = new Tester();
        tester4.setInfo("Kuman",47,'M',361,"QA",company,75000);

        ArrayList<Tester>testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4));

        Developer developer1 = new Developer();
        developer1.setInfo("Kerem",28,'M',6,"QA",company,75000);
        Developer developer2 = new Developer();
        developer2.setInfo("Tarik",48,'M',16,"QA",company,75000);
        Developer developer3 = new Developer();
        developer3.setInfo("Ata",38,'M',61,"QA",company,75000);
        Developer developer4 = new Developer();
        developer4.setInfo("Kaya",47,'M',361,"QA",company,75000);

        ArrayList<Developer>developers=new ArrayList<>();
        developers.addAll(Arrays.asList(developer1,developer2,developer3,developer4));

     ScrumTeam scrumTeam=new ScrumTeam(PO,BA,SM,testers,developers);

        System.out.println(scrumTeam);







    }



}
