package day35_OOP_Encapsulation.Restaurant;

public class Chef {
    private String name;
    int employeeID;
    private double hourlyRate;
    private boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.err.println("Invalid ID"+employeeID);
            System.exit(1);
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<=0){
            System.err.println("Invalid ID"+hourlyRate);
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making order");
    }

    public void washDishes(){
        System.out.println(name+" is washing dishes");
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=$" + hourlyRate +
                ", isFullTime=" + (isFullTime?"full-time":"Part-time") +
                '}';
    }
}

