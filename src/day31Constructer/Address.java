package day31Constructer;

public class Address {
    public int buildingNumber,zipCode;
    public String street,city,state;

    public Address(int buildingNumber, int zipCode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return
                  buildingNumber +" "+street+"  " +city +"\n"+ state+ ",  "+ zipCode ;
    }
}
