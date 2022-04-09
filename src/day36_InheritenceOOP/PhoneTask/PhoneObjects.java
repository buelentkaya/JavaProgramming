package day36_InheritenceOOP.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.brand = "Ihone12";
        iphone.color = "Black";
        iphone.size = "6.7 iches";
        iphone.price = 1000;

        System.out.println(iphone);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "Galaxy S20", "6.3", "White", 1225.50);

        System.out.println(samsung);

        samsung.freeze();
        samsung.call(31687000000l);
        samsung.text(31687000000l);

        Nokia nokia = new Nokia();

        nokia.setInfo("Nokia", "3310", "4.2", "Blue", 2555.99);

        System.out.println(nokia);

        nokia.selfDefense();
        nokia.call(31687000000l);
        nokia.text(31687000000l);
        
    }
}
