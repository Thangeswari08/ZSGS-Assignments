import java.util.*;
 class Exception3 {
    public static void main(String[] args) {
        try {
            Class.forName("abc.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
