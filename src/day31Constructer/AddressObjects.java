package day31Constructer;

public class AddressObjects {
    public static void main(String[] args) {
        Address address1=new Address(12,61169,"Kreuzgasse","Friedberg","Hessen");
        System.out.println(address1);

        Address address2=new Address(12,61169,"Krezgasse","Frankfurt Am Main","Hessen");
        System.out.println(address2);
    }
}
