package day31Constructer;

public class SalaryCalculator {
    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax() {
        return salary() * (stateTaxRate / 100);
    }

    public double federalTax() {
        return salary() * (federalTaxRate / 100);
    }

    public double salaryAfterTax() {
        return salary() - (federalTaxRate + stateTaxRate);
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=$" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }
}
