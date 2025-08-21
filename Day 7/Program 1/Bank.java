class RBI{
         public void interestRate(){
            System.out.println("RBI base interest rate is 4%.");
      }
}
class SBI extends RBI{
         public void interestRate(){
            System.out.println("SBI base interest rate is 5%.");
      }
}
class ICICI extends RBI{
         public void interestRate(){
            System.out.println("ICICI base interest rate is 6%.");
      }
}
class PNB extends RBI{
         public void interestRate(){
            System.out.println("PNB base interest rate is 5.5%.");
      }
}
class Account{
	 int accno;
         double balance;

      Account(int accno,double balance){
               this.accno=accno;
	       this.balance=balance;
          }

   public void showAccount(){
         System.out.println("Account No :"+accno);
	 System.out.println("Balance :" + balance);
     }
}

class Customer{
         String name;
         Account accno;

      Customer(String name,Account accno){
   
           this.name=name;
	   this.accno=accno;

         }

	public void showCustomer(){

          System.out.println("Name:"+name);
            accno.showAccount();
      }

}

class BankApp{
           public static void main(String[] args){


          Account a1=new Account(234,4000);
	  Customer c1=new Customer("Devi",a1);
	  SBI sbi=new SBI();
	  c1.showCustomer();
	  sbi.interestRate();
          System.out.println("-----------------------------------");
	  	
	 Account a2=new Account(201,5000);
	 Customer c2=new Customer("Thangoo",a2);
	 ICICI icici=new ICICI();
	 c2.showCustomer();
	 icici.interestRate();

       }
}
			






