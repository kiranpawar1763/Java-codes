import java.util.Scanner;

public class Employee 
{
    private  int EmployeeId;
    private String Employeename;
    private Double EmployeeSalary;
    
    public void setEmployeeData()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Emplooye ID: ");
        this.EmployeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Employee name:");
        this.Employeename=scanner.nextLine();

        System.out.println("Enter the Employee salary:");
        this.EmployeeSalary=scanner.nextDouble();

        System.out.println("Employee data set successufully\n");
        
    }
    public void getEmployeeData()
    {
        System.out.println("Employee Information");
        System.out.println("Employee Id:"+EmployeeId);
        System.out.println("Employee name:"+Employeename);
        System.out.println("Employee salary:"+EmployeeSalary);
    }
    public static void main(String[]args)
    {
        Employee e1=new Employee();

        e1.setEmployeeData();
        e1.getEmployeeData();

    }
}
