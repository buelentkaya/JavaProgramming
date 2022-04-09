package day31Constructer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("VA", "Cydeo", "SDET", 110000, true, true, true, true);
        System.out.println("offer1 = " + offer1);
        offer2.setInfo("CA", "Sony Inc.", "QA", 120000, true, false, false, true);
        System.out.println("offer2 = " + offer2);
        offer3.setInfo("FL", "Apple", "QE", 1250000, true, true, true, false);
        offer4.setInfo("TX", "CapitalOne", "Scrum Master", 115000, false, false, false, true);
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true, true, true, true);

        ArrayList<Offer>allOffers=new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        System.out.println("allOffers = " + allOffers);

        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};
        System.out.println(Arrays.toString(myOffers));

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));//allOffers hashcode veriyor

        fullTimeOffers.removeIf(p->!p.isFullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println(fullTimeOffers.size());//4

        System.out.println("\".........................\" = " + ".........................");
        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("VA"));
        System.out.println("localOffers = " + localOffers);
        System.out.println(localOffers.size());// 1

for(Offer localOffer:localOffers){
    System.out.println(localOffer.company+" offers me $"+localOffer.salary);
}
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
