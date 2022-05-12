package day45_Abstraction_Interface.browserTask;

public class RemoteWebDriver implements WebDriver,TakeScreenShot,JavaScriptExecuter{
private final String browserName;

   public RemoteWebDriver(String browserName) {
      this.browserName = browserName;
   }

   public String getBrowserName() {
      return browserName;
   }

   public void openBrowser(){
      System.out.println("Opening "+ browserName+" browser");
   }
   @Override
   public void executeScript(String script) {

   }

   @Override
   public String findElement(String locator) {
      return null;
   }

   @Override
   public String findElements(String locator) {
      return null;
   }


   @Override
   public void takeScreenShot() {

   }

   @Override
   public void get(String url) {

   }

   @Override
   public void close() {

   }

   @Override
   public void quit() {

   }

   @Override
   public void getTitle() {

   }
}
