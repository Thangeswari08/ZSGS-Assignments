package travel.user;
public class user{
           
         String name;
	 int age;
	 String from;
	 String to;
     public user(String name,int age,String from,String to){
	  this.name=name;
	  this.age=age;
	  this.from=from;
	  this.to=to;
        }
    public void display(){
          System.out.println("Passenger Name:"+name);
	  System.out.println("Passenger age:"+age);
	  System.out.println("From:"+from);
	  System.out.println("To:"+to);
         }
  }


	








