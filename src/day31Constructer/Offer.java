package day31Constructer;

public class Offer {
    public String location;
    public String company;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;

    public void setInfo(String location, String company, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
       this. company = company;
       this. jobTitle = jobTitle;
       this. salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", Company='" + company + '\'' +
                ", JobTitle='" + jobTitle + '\'' +
                ", Salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println("working in "+location+ " in this Company "+company);
    }
}
