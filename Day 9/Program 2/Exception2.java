import java.util.*;
public class Exception2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a= sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

          //  int a = Integer.parseInt(num1);
          //  int b = Integer.parseInt(num2);
            int result = a / b;
            System.out.println("Result: " + result);
      } catch (InputMismatchException e) {
            System.out.println("Input type mismatch.");
      } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
      } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
      } catch (Exception e) {
            System.out.println("Something went wrong.");
      }
    }
}
