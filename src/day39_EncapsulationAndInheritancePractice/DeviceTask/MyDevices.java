package day39_EncapsulationAndInheritancePractice.DeviceTask;

import day37_Inheritance.PhoneTask.Iphone;
import day37_Inheritance.PhoneTask.Nokia;
import day37_Inheritance.PhoneTask.Samsung;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        Laptop laptop=new Laptop("Acer","Acer 2321xy",1000,true,true);
        TV tv=new TV("Samsung","SamsungXY12",550,false,true);

        laptop.turnOn();
        tv.setBrand("Philips");
        tv.setModel("Philips Crstall");
        tv.channelDown();

    }
}
