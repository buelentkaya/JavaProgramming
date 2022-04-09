package day36_InheritenceOOP.PhoneTask;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is having a Face Time with phone number " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is having a Face Time with email " + email);
    }


    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
