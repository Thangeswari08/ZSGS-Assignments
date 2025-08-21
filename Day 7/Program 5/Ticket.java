import java.util.*;

abstract class Ticket{
       abstract void bookTicket();
     }      
class flight extends Ticket{
         String from;
         String to;
         int fare_amount;
          
        flight(String from,String to,int fare_amount)
            {
              this.from=from;
	      this.to=to;
	      this.fare_amount=fare_amount;
            }
     public void bookTicket()
           {
             System.out.println("Flight ticket Booked...!");
	     System.out.println("---------------------");
             System.out.println("From :" + from);
	     System.out.println("To:" + to);
	     System.out.println("Amount:"+fare_amount);
            }
        
       }
class train extends Ticket{
         String from;
         String to;
         int fare_amount;
    
        train(String from,String to,int fare_amount){
              this.from=from;
	      this.to=to;
	      this.fare_amount=fare_amount;
             
           }
        public void bookTicket()
           {
             System.out.println("Train ticket Booked...!");
	     System.out.println("---------------------");
             System.out.println("From :" + from);
	     System.out.println("To:" + to);
	     System.out.println("Amount:"+fare_amount);
            }
        
     }

class bus extends Ticket{
         String from;
         String to;
         int fare_amount;

         bus(String from,String to,int fare_amount){
              this.from=from;
	      this.to=to;
	      this.fare_amount=fare_amount;
             
            }
   public void bookTicket()
           {
             System.out.println("Train ticket Booked...!");
	     System.out.println("---------------------");
             System.out.println("From :" + from);
	     System.out.println("To:" + to);
	     System.out.println("Amount:"+fare_amount);
            }
     }
class TicketBooking{

         public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Choice:");
	    System.out.println("1.Filght");
            System.out.println("2.Train");
	    System.out.println("3.Buss");
	    int choice = sc.nextInt();	
            sc.nextLine();
            if(choice == 1){	

		System.out.println("From:");
		String from=sc.nextLine();
		System.out.println("TO:");
		String to=sc.nextLine();	 
            Ticket T1= new flight(from,to,2000);
            T1.bookTicket();
             }else if(choice == 2){
	    Ticket T2=new train("Tirunelveli","Tiruchenthur",120);
	    T2.bookTicket();
            }else if(choice == 3){
	    Ticket T3=new bus("Tirunelveli","Pirancheri",0);
	    T3.bookTicket();
             }else {
            System.out.println("Invalid Choice.");
          }
      }
}
  



               
          

   	
        
        
        
     
 	  
