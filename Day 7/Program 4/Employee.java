import java.util.*;
interface Employee{
        double calculatesalary();
  }
    
class  FullTimeEmployee implements  Employee{
	private String name;
	private int id;
	private double monthlysalary = 40000;
            
 
     public void fulltime(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the Employee Name:");
         name = scan.nextLine();
	 System.out.println("Enter the Employee ID:");
	 id = scan.nextInt();
       
    }
    public double calculatesalary(){
  	return monthlysalary;
    }
    public void showdetails(){
        System.out.println("Employee Name :" + name);
        System.out.println("Employee ID:"+id);
        System.out.println("Monthly Salary:" +calculatesalary());
    } 
        
}  
class PartTimeEmployee implements Employee{
     private String name;
     private int id;	 	
     private int hourRate = 150;
     private int hour; 

    public void partTime(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Employee ID:");
     id=sc.nextInt();
     System.out.println("Enter the Name:");
     sc.nextLine();
     name=sc.nextLine();
     System.out.println("Enter the Hour:");
     hour=sc.nextInt();
 }
    public double calculatesalary(){
  	return (double)hourRate*hour; 
  }
  public void showdetails(){
     System.out.println("Employee ID"+id);
     System.out.println("Employee name:"+name);
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
        }else if(choice==2){
        System.out.println("Enter details for PART-TIME employee:");
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.partTime();         
        pte.showdetails();  
        } else{
        System.out.println("Invalid Choice.");
       }
      
     }
}
   
                  
                             
           
         






     	  		