import java.util.*;
class Exception4 {
    public static void main(String[] args){
        parseInt("123a");
       }

   static void parseInt(String input) {
      try {
            int value = Integer.parseInt(input);
            System.out.println("Parsed integer: " + value);
       } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + input);
       }
    } 
}
