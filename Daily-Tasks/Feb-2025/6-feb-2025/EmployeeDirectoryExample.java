/*
Employee Directory:
Develop an employee directory that stores employee information (name, position, salary) and allows CRUD operations using collections.

Employee Class:
This class represents an employee with attributes like name, position, and salary.
It has a constructor to initialize an employee's details and getters/setters to access and modify these details.
The toString() method is overridden to provide a string representation of an employee's details.

Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index.

EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.*/

import java.util.ArrayList;
import java.util.List;

  class Employee 
 {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) 
    {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() 
    
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getPosition() 
    {
        return position;
    }

    public void setPosition(String position)
     {
        this.position = position;
    }

    public double getSalary()
     {
        return salary;
    }

    public void setSalary(double salary)
     {
        this.salary = salary;
    }

    @Override
    public String toString()
     {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + "}";
    }
}
 class Directory
{
    private List<Employee> employees;

    public Directory() 
    {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) 
    {
        employees.add(employee);
    }

    public void displayAllEmployees() 
    {
        employees.forEach(System.out::println);
    }

    public void updateEmployee(int index) 
    {
        Employee e = employees.get(index);
        
        e.setPosition("Senior Developer");
        e.setSalary(55000);

    }

    public void deleteEmployee(int index) 
    {
        employees.remove(index);
    }
}
   public class EmployeeDirectoryExample
{
    public static void main(String[] args)

     {
        Directory directory = new Directory();
        directory.addEmployee(new Employee("Alice", "Manager", 60000));
        directory.addEmployee(new Employee("Bob", "Developer", 50000));
        directory.displayAllEmployees();
         directory.updateEmployee(1);
        directory.displayAllEmployees();
        directory.deleteEmployee(0);
         directory.displayAllEmployees();
    }
}

