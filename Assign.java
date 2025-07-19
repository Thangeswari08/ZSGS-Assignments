import java.util.*;
class Variables
 {
     static int a;    //static variable
     int b;           //Instance variable
 public static void main(String[] args)
   {
     int c = 6 ;       //local variable
     {
       int d = 10;
       System.out.println("Block" + d );   //Block variable
     } 
         Sample s = new Sample();
          final int e = 11;        //final variable
   System.out.println("Instance variable " + (s.b));
   System.out.println("Static variable " + a );
   System.out.println("local variable " + c );
   System.out.println("final variable" + e );
    }
    
 }  
//-------------------------------------------------------------------------------- 
class datatypes{
      
    public static void main(String[] args)
{
     int x = 16 ;
     double y = 25 ;
     float z = 36.2345f ;
     long a = 10000;
     char ch = 'A';
     byte b = 49;
  System.out.println(" integer value : " + x );
  System.out.println(" double value : " + y );
  System.out.println(" float value : " + z );
  System.out.println(" long value : " + a );
  System.out.println(" character : " + ch );
  System.out.println(" byte value : " + b );
}
}
//-------------------------------------------------------------------------------

class maximum
   {
      public static void main(String[] arg)
        {
         int x = 9 ;
         int y = 10 ;
    int max = x > y ? x:y;
          System.out.println("Maximum value :" + max);
    }
 } 
//-------------------------------------------------------------------------------
 class 	EqualorNot
{
 public static void main(String[] args)
  {
   int x = 10;
   int y = 20;
  if((x ^ y) == 0)
     {
       System.out.println("Equal");
   } else
         {
           System.out.println("Not Equal");
          }
       }
     }
//--------------------------------------------------------------------------------
class Block
{
     static int x;
     static
       {
          System.out.println("Static Block : " + x);
        }
   Block()
          {
              x = 10 ;
    System.out.println("Initializer Block :  " + x );
             }   
 public static void main(String[] args)
    {
           Block obj = new Block();
        }
  }
 //-------------------------------------------------------------------------------     
class Explicit
   {
     public static void main(String[] args)
        {
         int x = 99;
         System.out.println("Integer to Character :"+ (char)x);

         int y = 27;
         System.out.println("Integer to Double :" + (double)y );//Widdening

         double z = 45.908;
        System.out.println("Double to Integer : " + (int)z);//narrowing
   }
      
 }

//---------------------------------------------------------------------------------
class PowerofN
{
    public static void main(String[] args)
      {
    int x = 15;
    int num = x ;
  while(num % 2 == 0 && num > 1)
      {
         num = num / 2 ;
        }
        if(num==1)
        {
       System.out.println(num + "is a number is power of 2 ");
        }
	else
       {  
        System.out.println(num + " is not a number is power of 2");
      }
    }
 }  
//------------------------------------------------------------------------------------
class firstsetbit 
 {
   public static void main(String[] args)
     {
        int num = 14;
        int x = num ;
        int Binary = 0;int i = 1 ;
     while(num > 0)
    {
      Binary+=num % 2 * i;
      num = num / 2 ;
      i=i*10;
     }
   System.out.println("Binary Value " + Binary);
   String s = String.valueOf(Binary);
System.out.println(s);
     int position = 0 ;
 for(i = 0;i<s.length();i++)
   {
     if(s.charAt(i)=='1')
      {
       position = i ;
      }
  }

     System.out.println("First set bit of number is " + (s.length()-position-1));
   }
    
  }
//------------------------------------------------------------------------------------
class Employee
{
    int emp_id;
    String emp_name;
    String dept;
    double salary;
    
     Employee(int emp_id,String emp_name,String dept,double salary)
         {
           this.emp_id=emp_id;
           this.emp_name=emp_name;
           this.dept=dept;
           this.salary=salary;
 System.out.println("Employee ID : " + emp_id);
 System.out.println("Employee name : " + emp_name);
 System.out.println("Employee department : " + dept);
 System.out.println("Employee salary : " + salary);
} 
    public static void main(String[] args)
      {
  Employee e1 = new Employee( 108 , "Thango" , " Developing" , 20000);
     }
  }
//-------------------------------------------------------------------------------
class check
{
   public static void main(String[] args)
   {   
     check obj = new check();
  System.out.println(obj instanceof check);
       }
}
   

          
  
             
                
    
    
    
   


















    