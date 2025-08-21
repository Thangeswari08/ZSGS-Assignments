class Payment
    {
        private int  transaction_ID;
        private String  payer_name; 
        private String payee_name;
        private double amount; 
        private String payment_method;
        private String transaction_status;
 
     void setTransaction_ID(int  transaction_ID)
        {
          this.transaction_ID = transaction_ID;
         }
     void setPayer_name(String  payer_name)
        {   
        this.payer_name = payer_name;
        }
     void setPayee_name(String payee_name)
       {
        this.payee_name=payee_name;
       }
     void setAmount(double amount)
     {
       this.amount=amount;
     }
     void setPayment_method(String payment_method)
       {
        this.payment_method=payment_method;
       }
    void setTransaction_status(String transaction_status)
      {
     this.transaction_status=transaction_status;
       }



     int   getTransaction_ID()
        {
    return transaction_ID;
       }
    String getPayer_name()
       {
     return payer_name;
        }
     String getPayee_name()
       {
    return payee_name;
       }
    double getAmount()
         {
      return amount;
        }
   String getPayment_method()
         {
      return payment_method;
         }
     String getTransaction_status()
        {
      return transaction_status;
       }
     
}
class Paymentgateway{     
   public static void main(String[] args)
      {
           Payment obj = new Payment();
           obj.setTransaction_ID(01);
           obj.setPayer_name("Thango");
           obj.setPayee_name("Devi");
           obj.setAmount(40000);
           obj.setPayment_method("Gpay");
           obj.setTransaction_status("Victory...!");
       System.out.println("Transaction ID "+"   "+"Payer name"+"  "+"Payee name"+"  "+"Amount"+"  "+"Payment method"+"  "+"Transaction Status");
       System.out.println("---------------"+"   "+"----------"+"  "+"----------"+"  "+"------"+"  "+"--------------"+"  "+"------------------");
       System.out.println("\t"+obj.getTransaction_ID()+"\t"+obj.getPayer_name()+"\t\t"+obj.getPayee_name()+"\t  "+obj.getAmount()+"\t"+obj.getPayment_method()+"\t\t"+obj.getTransaction_status());
   }
}