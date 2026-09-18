package week_6_assignment_problems;

public class CompanyEmployee {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        CompanyEmployee employee1 = new CompanyEmployee("Rahul", 50000);
        CompanyEmployee employee2 = new CompanyEmployee("Priya", 55000);
        CompanyEmployee employee3 = new CompanyEmployee("Krithi", 60000);

        CompanyEmployee.printCompanyInfo();
    }
}