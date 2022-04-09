package day36_InheritenceOOP.SportTask;

public class Sport {
   public String name;
   public int numberOfRules,numberOfReferee;
   public String rules;

   public void setInfo(String name, int numberOfRules, int numberOfReferee, String rules) {
      this.name = name;
      this.numberOfRules = numberOfRules;
      this.numberOfReferee = numberOfReferee;
      this.rules = rules;
   }

   public void play(){
      System.out.println(name+" is playing");
   }

   public String toString() {
      return "Sport{" +
              "name='" + name + '\'' +
              ", numberOfRules=" + numberOfRules +
              ", numberOfReferee=" + numberOfReferee +
              ", rules='" + rules + '\'' +
              '}';
   }
}
