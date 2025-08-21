import java.util.*;
interface PaymentMethod{
         void pay(double amount);
	}

class CreditCardPayment implements PaymentMethod{
	private String acc_holdername;
	private String Creditcard_no;
	
	CreditCardPayment(String acc_holdername,String Creditcard_no){

 	this.acc_holdername=acc_holdername;
	this.Creditcard_no=Creditcard_no;
	}

	public void pay(double amount){
    
	System.out.println("Paymethod ---> CreditCard");
	System.out.println("--------------------------");
	System.out.println("Acc holder Name : " +acc_holdername);
	System.out.println("CreditCard No : " +Creditcard_no);
	System.out.println("Amount:"+amount);
	}
       
}

class DebitCardPayment implements PaymentMethod{
	private String acc_holdername;
	private String acc_No;
	private String bank_name;

	DebitCardPayment(String acc_holdername, String acc_No,String bank_name){

	this.acc_holdername=acc_holdername;
	this.acc_No=acc_No;
	this.bank_name=bank_name;
  	}

 	public void pay(double amount){

	
	System.out.println("Paymethod ---> DebitCard");
	System.out.println("--------------------------");
	System.out.println("Acc holder Name : " +acc_holdername);
	System.out.println("Account No : " +acc_No);
	System.out.println("Bank Name :"+bank_name);
	System.out.println("Amount:"+amount);
     }

}

class  UPIPayment implements PaymentMethod{
   	
	private String UPI_No;

	UPIPayment(String UPI_No){
	  this.UPI_No=UPI_No;

          }

	public void pay(double amount){
	System.out.println("Paymethod ---> UPI Method");
	System.out.println("--------------------------");
	System.out.println("UPI No : " +UPI_No);
	System.out.println("Amount:"+amount);

	}

}

class PaymentGateWay{
 	public static void main(String[] args){
	
	CreditCardPayment cr=new CreditCardPayment("Thango","567894594");
	cr.pay(500);
	DebitCardPayment d=new DebitCardPayment("Devi","7634589021","Indian Bank");
	d.pay(1000);	
	UPIPayment upi=new UPIPayment("769463476239");
	upi.pay(6000);

    }
}







