import java.util.*;
class Employee
    {
        protected String name;
    
  public void empdetails(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the Employee Name:");
         name = scan.nextLine();
   }
   public void showdetails(){
         System.out.println("Employee Name :" + name);
   }
}


class  FullTimeEmployee extends  Employee{
    private double monthlySalary;

    public void fulltime(){
        super.empdetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Monthly Salary: ");
	this.monthlySalary=sc.nextDouble();
    }
    public double calculatesalary(){
  	return monthlySalary;
    }
    public void showdetails(){
        super.showdetails();
        System.out.println("Monthly Salary:" + monthlySalary);
    } 
        
}  
class PartTimeEmployee extends Employee{
     private Double hourRate;
     private int hour; 

     public void PartTime(){
     super.empdetails();

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Salary: ");
     this.hourRate=sc.nextDouble();
     System.out.println("Enter the Hour:");
     this.hour=sc.nextInt();
 }
    public double calculatesalary(){
  	return hourRate*hour; 
  }
  public void showdetails(){
     super.showdetails();
     System.out.println("PartTime Working Salary:"+calculatesalary());
  }
    
}
class EmpDetails{
    public static void main(String[] args){
     
    System.out.println("Enter details for FULL-TIME employee:");
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.fulltime();        
        fte.showdetails(); 
        System.out.println("----------------------------");

        System.out.println("Enter details for PART-TIME employee:");
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.PartTime();         
        pte.showdetails();     
      
     }
}
   
                  
                             
           
         







