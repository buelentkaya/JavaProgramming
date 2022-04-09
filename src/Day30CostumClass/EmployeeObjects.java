package Day30CostumClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Bulent Kaya", 124578, 'M', "Teacher", 60000, true);
        employee2.setInfo("Burcin Kaya", 326598, 'F', "Secretary", 45000, true);
        employee3.setInfo("Recep", 784512, 'M', "SDET", 65000, true);
        employee4.setInfo("Hans", 894523, 'F', "Housemeister", 41000, false);
        employee5.setInfo("Muhtar", 567823, 'F', "Instructer", 75000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (Employee eachEmployee : employees) {
            System.out.println(eachEmployee);
        }
        System.out.println(".......fultimeEmployees............");

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSalary = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;
            } else {
                countPartTime++;
            }
            if(employee.salary>maxSalary){
                maxSalary=employee.salary;
            }
            if(employee.salary<minSalary){
                minSalary=employee.salary;
            }
        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);


        System.out.println("......................................");


    }
}
