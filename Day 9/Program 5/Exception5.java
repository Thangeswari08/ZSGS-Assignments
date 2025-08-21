import java.util.*;
class Exception5 {
    public static void main(String[] args) {
        System.out.println("Returned value: " + test());
        }
 static int test() {
        try {
           // System.out.println("In try block.");
            return 10;
        } finally {
            System.out.println("In finally block.");
        }
    }
}
