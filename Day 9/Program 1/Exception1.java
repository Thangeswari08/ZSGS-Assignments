import java.util.*;
class Exception1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try {
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient: " + quotient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}
