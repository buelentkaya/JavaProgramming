package day44_OOP_Abstraction.deviceTask;

public class AndroidApps implements downloadable{

  public String AppStoreName, OS;

    @Override
    public void downloadApp() {
        System.out.println(AppStoreName+" is downloding a new app.");
    }
}
