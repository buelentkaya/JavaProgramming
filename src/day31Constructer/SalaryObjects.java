package day31Constructer;

public class SalaryObjects {
    public static void main(String[] args) {
        SalaryCalculator salary1=new SalaryCalculator(20,40,20,25);
        System.out.println(salary1.salaryAfterTax());
        System.out.println(salary1);
    }
}
