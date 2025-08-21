import java.util.*;
class Bank {
     
         private String accountno;
	 private String accountholder_name;
	 private double balance;


	 public void setAccountno(String accountno){
             this.accountno=accountno;
	 }
	 public void setAccountholder_name(String accountholder_name){
             this.accountholder_name=accountholder_name;
	 }
	 public void setAccount_balance(double balance){
             this.balance=balance;
	 }
         public String getAccountno(){
             return accountno;
	 } 
	 public String getAccountholder_name(){
             return accountholder_name;
	 } 
  	 public double getAccount_balance(){
             return balance;
	 } 
 	 public void display(){
	      System.out.println("Account No:" +accountno);
	      System.out.println("Account holder Name:"+accountholder_name);
	      System.out.println("Existing balance:"+balance);
         }		
  

	public void deposit(double amount){
	          display();	
	      this.balance+=amount;
              System.out.println("Amount to be deposited:"+amount);
              System.out.println("Balance after Deposit:"+this.balance);	
        }

	public void withdraw(double amount){
       	      double min=500;
 	      if(balance>amount){
		if(balance-amount>=min){
		    balance-=amount;
		    System.out.println("Withdrawal successful..!Remaining balance: " + balance);	
                    }else{
		    System.out.println("Withdrawal failed.Your account must have at least " + min + " balance.");
          	    }
                }else{
		    System.out.println("Insufficient funds. Current balance: " + balance); 
            }
         }
    
}


 class BankAccount{

        public static void main(String[] args){
	         Scanner sc = new Scanner(System.in); 
     
                  Bank b1=new Bank();
    		  b1.setAccountno("540821537");
 	          b1.setAccountholder_name("Devi");
	          b1.setAccount_balance(1000);
		  b1.display();
                  while(true){
                  System.out.println("\nChoose an Option:");
		  System.out.println("1.Deposit");
		  System.out.println("2.Withdraw");
		  int choice=sc.nextInt();
		  
		 System.out.print("Enter amount: ");
                 double amount = sc.nextDouble();

                 if (choice == 1) {
                     b1.deposit(amount);
                   } else if (choice == 2) {
                     b1.withdraw(amount);
                   } else {
                 System.out.println("Invalid option.");
               }
           }
     }
}





