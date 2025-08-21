import java.util.*;

class Ticket{
         String from;
         String to;
         int fare_amount;

    Ticket(String from , String to , int fare_amount)
          {
         this.from=from;
         this.to=to;
         this.fare_amount=fare_amount;
          }
  
   public void display(){
          System.out.println("From:"+from);
         System.out.println("To:"+to);
 	 System.out.println("Amount:"+fare_amount);
       }

   }      
class flight extends Ticket{
          
          flight(String from,String to,int fare_amount)
            {
              super(from,to,fare_amount);
            }
     public void display()
           {
             System.out.println("Flight ticket Booked");
            
            }
        
       }
class train extends Ticket{
    
        train(String from,String to,int fare_amount){
             super(from,to,fare_amount);
           }
       public void display()
          {
          System.out.println("Train ticket Booked");
         
          }
     }

class bus extends Ticket{

         bus(String from,String to,int fare_amount){
            super(from,to,fare_amount);
            }
    public void display()
         {
          System.out.println("Bus ticket Booked");
        
         }
     }
class TicketBooking{

         public static void main(String[] args){
            Ticket T1= new flight("Tirunelveli","Chennai",400);
            T1.display();
	    Ticket T2=new train("Mumbai","Pirancheri",1000);
	    T2.display();
	    Ticket T3=new bus("Tirunelveli","Tiruchenthur",50);
	    T3.display();
      }
}
  



               
          

   	
        
        
        
     
 	  
