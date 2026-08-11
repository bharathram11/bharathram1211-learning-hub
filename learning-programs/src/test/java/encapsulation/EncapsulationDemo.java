package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an object of Employee
        Employee emp = new Employee();

        // Set values using setter methods
        emp.setEmpId(101);
        emp.setEmpName("John Doe");
        emp.setSalary(50000);

        // Get and display values using getter methods
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Trying to set an invalid salary
        emp.setSalary(-1000); // This will print a validation message
    }
}

