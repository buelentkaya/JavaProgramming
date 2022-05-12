package day44_OOP_Abstraction.deviceTask;

public class MobileShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("XS Max", 12000, "Gold", "Large");
        iphone.downloadApp();
        iphone.turnOn();
        iphone.turnOff();
        iphone.fingerPrint();

        Samsung samsung = new Samsung("Galaxy 10",12500,"Gray","Small");
        samsung.downloadApp();
        samsung.turnOn();
        samsung.turnOff();


        Google google = new Google("Pro Pixel 4", 8000,"White","large");
        google.downloadApp();
        google.turnOn();
        google.turnOff();


        PersonalComputer pc = new PersonalComputer("Apple","MacbookAir",17000,"Space Gray","13 Inc");
        pc.playGame("xQw");
        pc.turnOn();
        pc.turnOff();

        Desktop desktop = new Desktop("Lenova","XXT",7000,"Black","Small");
        desktop.turnOn();
        desktop.turnOff();


        Laptop laptop = new Laptop("Acer","Nitro 5",3500,"Black","large");
        laptop.turnOff();
        laptop.turnOn();

    }
}
