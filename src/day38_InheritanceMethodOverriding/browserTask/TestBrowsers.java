package day38_InheritanceMethodOverriding.browserTask;

public class TestBrowsers {
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser=new ChromeBrowser();
        Safari safari=new Safari();
        FireFoxBrowser fireFoxBrowser=new FireFoxBrowser();
        Opera opera=new Opera();

        opera.closeBrowser();
        safari.openBrowser();
        chromeBrowser.closeBrowser();
        fireFoxBrowser.openBrowser();
    }
}
