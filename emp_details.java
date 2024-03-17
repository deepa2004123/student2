  // Parent class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Person class
class Employee extends Person {
    private int empId;
    private double salary;

    // Constructor
    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        super.displayDetails(); // calling parent class method to display person details
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class emp_details{
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, 1001, 50000.0);
        
        // Displaying employee details
        emp.displayEmployeeDetails();
    }
}

