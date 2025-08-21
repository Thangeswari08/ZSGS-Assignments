import java.util.*;
class Command{
        public static void main(String[] args){
             String[] arr = new String[5];
	     for (int i = 0 ; i < arr.length ;i++)
         {
           arr[i]=args[i];
         }
      
     for(int i = 0 ; i < arr.length ;i++)
           {
        System.out.println(arr[i]);
        }
    }
}
