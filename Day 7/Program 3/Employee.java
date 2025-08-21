import java.util.*;
abstract class Employee{
        private String name;
	private int id;
     abstract double calculatesalary();

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
            
    double monthlysalary=40000;
    public void fulltime(){
        super.empdetails();
       
    }
    public double calculatesalary(){
  	return monthlysalary;
    }
    public void showdetails(){
        super.showdetails();
        System.out.println("Monthly Salary:" +calculatesalary());
    } 
        
}  
class PartTimeEmployee extends Employee{
     private Double hourRate;
     private int hour; 

     public void PartTime(){
     super.empdetails();

     Scanner sc = new Scanner(System.in);
     int hourRate=150;
     System.out.println("Enter the Hour:");
     this.hour=sc.nextInt();
 }
    public double calculatesalary(){
  	return (double)hourRate*hour; 
  }
  public void showdetails(){
     super.showdetails();
     System.out.println("PartTime Working Salary:"+calculatesalary());
  }
    
}
class EmpDetails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("1.FullTime Employee");
	System.out.println("2.PartTime Employee");
	int choice = sc.nextInt();
     
    System.out.println("Enter details for FULL-TIME employee:");
         if(choice==1){
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.fulltime();        
        fte.showdetails(); 
        System.out.println("----------------------------");
        }else{
        System.out.println("Enter details for PART-TIME employee:");
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.PartTime();         
        pte.showdetails();  
        }   
      
     }
}
   
                  
                             
           
         





