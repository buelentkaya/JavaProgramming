package day35_OOP_Encapsulation.ScrumTeam;

import day37_Inheritance.ScrumTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;

    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();
//   private ArrayList<Tester> testers;
//    private  ArrayList<Developer> developers;


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        setBA(BA);
        setPO(PO);
        setSM(SM);
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }
//Not generating getters for tester/developers arrayList because they should only be set when tester/developer is added/removed

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }


    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void hireTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf( p -> p.getId() == id);
    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDevelopers(Developer[] Developers){
        this.developers.addAll(Arrays.asList(Developers));
    }

    public void removeDeveloper(int id){
        developers.removeIf( p -> p.getId() == id);
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
