package day45_Abstraction_Interface.browserTask;

public interface WebDriver extends SearchContext {
    abstract void get(String url);
    abstract void close();
    abstract void quit();
    abstract void getTitle();

}
