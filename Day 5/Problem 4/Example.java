
class Base{
         
        private void privateMethod(){

                  System.out.println("Private Method");
        }

        public static void staticMethod(){

		System.out.println("Static Method");
}  


	public final void finalMethod(){
          
		System.out.println("Final Method");

}
      public void normalMethod(){

		System.out.println("Normal Method");
   }

}
class Derived extends Base{
         
        private void privateMethod(){

                  System.out.println("Derived :Private Method");
        }

        public static void staticMethod(){

		System.out.println("Derived :Static Method");
	}  


	public final void finalMethod(){
          
		System.out.println("Final Method");

		}
      public void normalMethod(){

		System.out.println("Derived : Normal Method");
  	 }
    
}
       
    
 public class Example{
		  public static void main(String[] args){


                          Base b1=new Derived();
			  b1.privateMethod();	
                          b1.staticMethod();
			  b1.finalMethod();
			  b1.normalMethod();		

			}


}

       