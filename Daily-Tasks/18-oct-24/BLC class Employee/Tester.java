class Employee
{
private String firstName;
private String lastName;
private int employeeId;
private double salary;
private int noOfProject;

 public void setEmployee(String firstName,String lastName, int employeeId,double salary,int noOfProject)

    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this. salary=salary;
        this.noOfProject=noOfProject;
    }
    public void calculateSalary() 
    {
        if (noOfProject > 5 && noOfProject < 10) 
        {
            salary += 5000;
        } else if (noOfProject >= 10 && noOfProject < 20)
         {
            salary += 10000;
        } else if (noOfProject >= 20)
         {
            salary += 15000;
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Number of Projects: " + noOfProject);
        System.out.println("Updated Salary: $" + salary);
    }
}

// ELC class: Tester
public class Tester 
{
    public static void main(String[] args)
     {
        // Create an Employee object
        Employee emp = new Employee();

        // Set employee data
        emp.setEmployee("John", "Doe", 12345, 50000, 12);

        // Calculate the updated salary based on the number of projects
        emp.calculateSalary();

        // Display employee details
        emp.displayDetails();
    }
}
