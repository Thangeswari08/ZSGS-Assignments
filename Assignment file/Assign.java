import java.util.*;
class Variable
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
         Variable s = new Variable();
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
//--------------------------------------------------------------------------------
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
//-----------------------------------------------------------------------------------
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
//--------------------------------------------------------------------------------
//Day 2 - Assignment 
class min
   { 
     public static void main(String[] args)
       {
          int x = 6 ;
          int y = 8 ;
          int z = 10 ;
         int min = x ;
 if(x>y)
   {
      min = y;
    }
      if(y>z)
        {
           min = z;
        }
     System.out.println(" Minimum number is " + min );   
    }
 } 
//--------------------------------------------------------------------------------
class zohocorp
  {
      public static void main(String[] args)
    {
      String[] str = {"ZOHO","CORP","ORAT","IONS"};
      int i = 0;
      do{
         System.out.println(str[i]);
         i++;
     }while(i<str.length);
    }
}
//--------------------------------------------------------------------------------
class sumEven
{
  public static int sumEven(int n )
   {
       int sum = 0;
   for(int i =1;i <=n;i++)
       {
          if(i % 2 != 0)
       {
        continue;
        }
         sum+=i;
      }
          return sum;
      }
         public static void main(String[] args)
      {
          int n = 10 ;
          System.out.println("Sum of even numbers from 1 to " + n + "is" + sumEven(n));
       }
    }
//-----------------------------------------------------------------------------------
class DecimaltoBinary
{
   public static String DecimaltoBinary(int decimal)
   {  
   String binary="";
  int num = decimal;
     do {
          int rem =num%2;
          binary = rem+binary;
          num /= 2;
        } while (num>0);
        return binary;
    }
       public static void main(String[] args)
          {
          int decimal = 25;
       String binary = DecimaltoBinary(decimal);
      System.out.println("Binary number is " + binary );
       }
    }
//-------------------------------------------------------------------------------------
class Grade 
{ 
public static void gradeIf(int percent)
    {
        System.out.println("using if-Case");
        if (percent >= 85 && percent <= 100) 
              {
            System.out.println("Grade: A");
              } 
          else if (percent >= 70) 
          {
            System.out.println("Grade: B");
         } 
           else if (percent >= 50) 
             {
            System.out.println("Grade: C");
          }  
          else 
              {
            System.out.println("Fail");
        }
    }
    public static void gradeSwitch(int percent) {
      System.out.println("using switch-case");
      int grade = percent / 10; 
        switch (grade) {
             case 10:
              case 9:
              case 8:
                if(percent >= 85)
                    {
                    System.out.println("Grade: A");
                }
                  else {
                    System.out.println("Grade: B");
                      }
                    break;
              case 7:
                   System.out.println("Grade: B");
                break;
                case 6:
                 case 5:
                System.out.println("Grade: C");
                 break;
              default:
                System.out.println("Fail");
              }
  }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter percentage: ");
        int percent = sc.nextInt(); 
         gradeIf(percent);
         gradeSwitch(percent);
        }
  }
  
//-----------------------------------------------------------------------------------
// Day 2 -Assignment --> Part - 2 
class Oddsum {
   public static void main(String[] args) 
  {
   int[] arr = new int[10];
   int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter integers:");
     for (int i=0;i<10;i++)
            {
             arr[i]=sc.nextInt();
             if (arr[i]%2 != 0)
                sum +=arr[i];
      }
  System.out.println("Sum of odd numbers: " +sum);
     }
} 
//------------------------------------------------------------------------------------     
class Primenumbers
{
 public static void main(String[] args)
   {
     int[] arr = new int[10];
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 integers:");
      for (int i=0;i<10;i++)
         arr[i]=sc.nextInt();
        System.out.println("Prime numbers:");
        for (int n : arr)
            {
            if (isPrime(n)) 
                {
                 System.out.print(n + " ");
                }  
       }
   }
    public static boolean isPrime(int n) 
          {
        if (n <= 1) return false;
        for (int i=2;i*i<=n;i++)
         if (n%i == 0) return false;
        return true;
        }
}
//------------------------------------------------------------------------------------
class Fibonacci
{
   public static void main(String[] args)
   { 
      int fib1=0;
      int fib2=1;
for(int i = 0 ; i < 30 ; i++)
    {
  System.out.print(fib1+" " );
   int next = fib1+fib2;
   fib1=fib2;
   fib2=next;
   }
  }   
}
//-----------------------------------------------------------------------------------
class DigitSum
{
  public static void main(String[] args)
   {
     int[] arr={12,6,45,13};
     print(arr);
    }
       
   public static void print(int[] arr)
       {
        int sum = 0;
	for(int i = 0 ; i < arr.length;i++)
	{
   		if(arr[i] >= 10 )
  		{
			while(arr[i]>0)  
      			{
     			int digit = arr[i] % 10;
    			sum+=digit;
  			arr[i]=arr[i]/10;
         		}
     
     		 }
	}
    	System.out.println("Sum of the Digits :" +sum);
  	}
 }    
//----------------------------------------------------------------------------------   
class IdenticalorNot
   {
      public static void main(String[] args)
        {  
            char[] x={'m','n','o','p'};
            char[] y={'m','n','o'};
            if(x.length != y.length)
               {
                System.out.println("False");
                return;
                } 
        for(int i = 0 ; i < x.length ; i++)
              {
                if(x[i]==y[i])
                  { 
                    continue;
                   }else 
                       {
                         System.out.println("False");
                         break;
                         }
                      }
         System.out.println("True");
        }
     }
//------------------------------------------------------------------------------------                     
class Records
       {
          public static void main(String[] args)
            {
           int[] arr = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Year :" );
           int input =sc.nextInt();
           for(int i = 0 ; i < arr.length ; i++)
               {
                  if(arr[i]==input)
                      {
                 System.out.println("Records Exist..");
                 return ;
                 }
             }
              System.out.println(" Record does not Exist ");     
           }
    }
//-------------------------------------------------------------------------------------
class Weightofpeople
      {
         public static void main(String[] args)
           {     
             int[] age = {30, 50 ,61 , 45, 80 , 33 , 53 , 56 , 78 , 34 };
             for(int i = 0 ; i < age.length ;i++)
                {
              for(int j = i + 1; j < age.length ;j++)
                     {  
              if(age[i]<age[j])
                        {
                       int temp = age[i];
                       age[i]=age[j];
                        age[j]=temp;
                     }
                   }
                }
               for(int i = 0 ; i < age.length ;i++)
               {
              System.out.print(age[i]+"  ");
          }
     }
  }
//--------------------------------------------------------------------------------------- 
class Ageofpeople
  {
    public static void main(String[] args)
       {
     int[] age={12,34,56,22,31,45,21,44,51,60};
     int C1=0;
     int C2=0;
     int C3=0;
    for(int i = 0 ; i < age.length ; i++)
         {
            if(age[i] < 18)
               {
                C1++;
               }
         if(age[i]>=18 && 60>=age[i])
               {
               C2++;
                }
        if(age[i]>60)
         { 
            C3++;
         }
      }
       System.out.println("Number of age below 18:" + C1);
       System.out.println("Number of age 18 to 60 : " +C2);
      System.out.println("Number of age  above 60 : " +C3);
 
  }
}
//----------------------------------------------------------------------------------------
class Students
    {
       public static void main(String[] args)
          {  
      int[] rollno = {1,2,3,4,5,6,7,8,9,10};
      int[] mark1 = {66,74,34,56,78,45,36,69,45,99};
      int[] mark2 = {75,83,56,73,66,83,72,55,67,90};
      int[] mark3 = {78,45,89,35,89,56,90,45,67,55};
   
 System.out.println("Roll No  Total  Avg");
 System.out.println("-------  -----  ----");

    for(int i = 0 ; i < rollno.length ;i++)
         {
            int total = mark1[i]+ mark2[i]+ mark3[i];
            int avg = total / 3 ;
	    System.out.println("  "+rollno[i]+"      "+total+"      "+avg+"  ");
         }
     }
}
//------------------------------------------------------------------------------------------
class Dimensional 
    {
    public static void main(String[] args)
   {
       int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int sum = 0;
    for(int i = 0 ; i < mat.length ; i++)
         {
    for(int j = 0 ; j <mat[0].length;j++)
       {
     System.out.print(mat[i][j]);
     sum+=mat[i][j];
       }
System.out.println();
     } 
System.out.println("\n\n Sum = " + sum+"\n\nRow-wise Sum\n\n");
 for(int i = 0 ; i < mat.length ; i++)
         {
       int Rowsum = 0 ;
    for(int j = 0 ; j <mat[0].length;j++)
       {
       Rowsum+=mat[i][j];
    
     }
  System.out.println("Row " + (i + 1)+ ":"+Rowsum);
   }

System.out.print("\nCol-wise Sum\n");
 for(int i = 0 ; i < mat.length ; i++)
         {
       int Colsum = 0 ;
    for(int j = 0 ; j <mat[0].length;j++)
       {
       Colsum+=mat[j][i];
     }
System.out.println("Col " + (i + 1)+ ":"+Colsum);
   }

System.out.print("\nTranspose\n");
 for(int i = 0 ; i < mat.length ; i++)
         {
    for(int j = 0 ; j <mat[0].length;j++)
       {
     System.out.print(mat[j][i]);
       }
System.out.println();
     } 
   }
}
//-----------------------------------------------------------------------------------
//Day 2 - Part 3 
class binarysum
  {
   public static void main(String[] args)
      {
  String s1="11";
  String s2="1";
  String str = "";
  int i =s1.length()-1;
  int j =s2.length()-1;
int sum = 0 ; int carry = 0 ;
while(i>=0 || j>=0 ||carry == 1)
   {
     sum=carry;
     if(i>=0)
        {
         sum+=s1.charAt(i)-'0';
         i--;
      }
    if(j>=0)
       { 
      sum+=s2.charAt(i)-'0';
      j--;
    }
   str=String.valueOf(sum%2) + str;
   carry=sum/2;
   }
       System.out.println(str);
     }
 }
//----------------------------------------------------------------------------------
class ReverseVowels
  {
    public static void main(String[] args)
       {
         String str = "Hello";
         char[] ch = str.toCharArray();
         int l = 0 ; 
         int r = str.length()-1;
         while(l<r) 
     {
    if(ch[l] == 'a'|| ch[l] == 'e' || ch[l] == 'i'|| ch[l] =='o' || ch[l] == 'u' || ch[l] == 'A' ||
         ch[l] == 'E' || ch[l]== 'I' || ch[l] == 'O' || ch[l] == 'U' )
        {
           if(ch[r] == 'a' || ch[r] == 'e' || ch[r] == 'i' || ch[r] == 'o' || ch[r] == 'u' ||
          ch[r] == 'A' || ch[r] == 'E' || ch[r] == 'I' || ch[r] == 'O' || ch[r] == 'U')  
                   {
                    char temp = ch[l];
                    ch[l]=ch[r];
                    ch[r]=temp;
                    l++;
                    r--;
                    } 
                 r--;
               }
            l++;
           }
       String result = " ";
       for(char c : ch  )
            {
         result+=c;
           }
         System.out.print("Revere the Vowel : " +result);
          
        }
    }            
//-------------------------------------------------------------------------------------------
 class Alphabet
    {  
    public static void main(String[] args)
       {  
        int n = 29;
       String str = alpha(n);
      System.out.println(str);
  }
public static String alpha(int n)
     {
      String result="";
     if(n<=26)
       {
         int x = 65+n-1;
         result+=(char)x+result;
         }else 
           { 
        return alpha(n/26)+alpha(n%26);
         }
        return result;
     }
  }  

//---------------------------------------------------------------------------------------
class Twostrings
    {
     public static void main(String[] args)
         {
          int[] fre = new int[26];
          String s = "abcd";
          String t = "abcde";
          char letter ='a';
     for(char c : s.toCharArray())
        {
          fre[c-'a']++; 
          }
   for(char c : t.toCharArray())
        {
        fre[c-'a']++;
         
      if(fre[c-'a']>0)
       {
         letter=c;
        }
     } 
     System.out.println( "Extra Letter : " + letter);
        }
    }  
//----------------------------------------------------------------------------------------

class IsSubsequence
      {
        public static void main(String[] args)
           {
         String  s = "abc";
         String  t = "ahbgdc";
         int l = 0 ;int r = 0 ;
   while(r<t.length())
        {
     if(s.charAt(l) == t.charAt(r))
           {
          l++;
        }
      r++;
   }
   System.out.println("Is Subsequence : " +( l == s.length()));
    }	
}
//-------------------------------------------------------------------------------------
class Addstring
     {
    public static void main(String[] args)
   	{
   String num1 = "11";
   String num2 = "123";
   String str ="";
  int i =num1.length()-1;
  int j = num2.length()-1;
 int sum = 0 ; int carry = 0 ;
while(i>=0 || j>=0 ||carry > 0)
   {
     sum=carry;
     if(i>=0)
        {
         sum+=num1.charAt(i)-'0';
         i--;
        }
    if(j>=0)
       { 
      sum+=num2.charAt(j)-'0';
      j--;
    }
   str=String.valueOf(sum%10) + str;
   carry=sum/10;
   
   }
       System.out.println(str);
     }
 }
//---------------------------------------------------------------------------------------
class Segments
   {
    public static void main(String[] args)
         {
       String  s = "Hello, my name is John";
       int segments = 0 ;
       for(int i = 0 ; i < s.length();i++)
             {
         if (( i == 0 || s.charAt(i-1)==' ') && s.charAt(i) != ' ')
              {
              segments++;
		}
	    }
	  System.out.println("Segments of the String is : " + segments);
   }
}
//---------------------------------------------------------------------------------------
class DetectCapital 
   {
    public static void main(String[] args)
       {  
       String word ="Google"; 
        int capitalcount = 0;
        int n = word.length();
        for(int i = 0 ; i < word.length() ;i++)
             {
  	 if(Character.isUpperCase(word.charAt(i)))
           	{
           	 capitalcount++;
           	} 
      	 }
    		if(capitalcount == n)
      		  {
         	 System.out.println("True");
     		  }
    		 if(capitalcount == 0)
         	{
           	 System.out.println("True");
        	 }
    if(capitalcount == 1 && Character.isUpperCase(word.charAt(0)))
       	 {
         System.out.println("True");
         }else{
    	System.out.println("False");
        }
     }
  }


























   

          
  
             
                
    
    
    
   


















    
