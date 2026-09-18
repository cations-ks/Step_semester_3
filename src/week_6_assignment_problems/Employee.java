package week_6_assignment_problems;

public class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println("Employee ID: " + empId +
                ", Name: " + empName +
                ", Salary: Rs " + salary +
                ", Intern: " + isIntern);
    }

    public static void main(String[] args) {
        Employee permanentEmployee = new Employee("E101", "Rahul", 50000);
        Employee intern = new Employee("I101", "Krithi");

        permanentEmployee.printProfile();
        intern.printProfile();
    }
}