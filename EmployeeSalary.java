import java.util.Scanner;


public class EmployeeSalary {
    
    private String employeeName;
    private int regularTime;
    private double rate;
    private int overtime;
    private double overtimePay;
    private double salary;
    
    public void setEmployeeName(String employeeName){
        
        this.employeeName = employeeName;
    
    
    }
    
    public void setOvertimePay(int regularTime, double rate, int overtime){
        
        this.regularTime = regularTime;
        this.rate = rate;
        this.overtime = overtime;
        
        
        
    
    }
    
    public String getEmployeeName(){
        
        System.out.println("Employee Name: " + employeeName);
    
        return employeeName;
    
    }
    
    public double getSalary(){
        
        salary = (regularTime*rate)+(overtime*rate*1.5);
        System.out.println("Salary: " + salary);
        return salary;
    
    
    }

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        EmployeeSalary object = new EmployeeSalary();
        
        System.out.print("Employee Name: ");
        object.setEmployeeName(input.nextLine());
        
        System.out.print("Enter regular time of work: ");
        object.regularTime = input.nextInt();

        System.out.print("Enter rate per hour: ");
        object.rate = input.nextDouble();
        
        System.out.print("Enter over time: ");
        object.overtime = input.nextInt();
        
        object.getEmployeeName();
        object.getSalary();
        
        
      
    }
    
}