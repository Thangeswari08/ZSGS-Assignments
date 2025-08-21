package travel.booking;
 public class Travel{
	
	int ticket_ID;
	String destination;
	int fare;

      public  Travel(int ticket_ID,String destination,int fare){
         this.ticket_ID=ticket_ID;
	 this.destination=destination;
	 this.fare=fare;
 	}

     public void display(){
	System.out.println("Ticket ID:"+ticket_ID);
        System.out.println("Destination:"+destination);
	System.out.println("Fare:"+fare);
     }

}         