package arrayss.oops;

class Employee {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    //method to calculate the salary
    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class CompanyPayroll {
    public static void main(String[] args) {

        Employee employee = new FullTimeEmployee("John", 123, 50000.0);
        System.out.println("Employee name: " + employee.name);
        System.out.println("Employee ID: " + employee.employeeId);
        System.out.println("Monthly salary: $" + employee.calculateSalary());
        employee = new PartTimeEmployee("Jane", 456, 10.0, 40);
        System.out.println("Employee name: " + employee.name);
        System.out.println("Employee ID: " + employee.employeeId);
        System.out.println("Hourly rate: $" + employee.calculateSalary());
    }
}
