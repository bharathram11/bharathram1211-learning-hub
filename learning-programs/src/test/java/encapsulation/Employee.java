package encapsulation;

//A class representing an Employee
public class Employee {

 // Private variables - data hiding
 private int empId;
 private String empName;
 private double salary;

 // Public getter method for empId
 public int getEmpId() {
     return empId;
 }

 // Public setter method for empId
 public void setEmpId(int empId) {
     this.empId = empId;
 }

 // Public getter method for empName
 public String getEmpName() {
     return empName;
 }

 // Public setter method for empName
 public void setEmpName(String empName) {
     this.empName = empName;
 }

 // Public getter method for salary
 public double getSalary() {
     return salary;
 }

 // Public setter method for salary
 public void setSalary(double salary) {
     if (salary > 0) {
         this.salary = salary; // Valid salary
     } else {
         System.out.println("Salary must be greater than zero!");
     }
 }
}

