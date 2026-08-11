public class Employee {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        
        // Using setters to set values
        emp.setName("John Doe");
        emp.setAge(30);

        // Using getters to retrieve values
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
    }
}
