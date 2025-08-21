import java.util.Scanner;
public class Exception6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit PIN: ");
        String pin = sc.next();
        try {
            validatePin(pin);
            System.out.println("Valid PIN.");
        } catch (Exception e) {
            System.out.println("Invalid PIN: " + e.getMessage());
     }
}

    public static void validatePin(String pin) throws Exception {
        if (pin.length() != 4) {
            throw new Exception("PIN must be exactly 4 digits long.");
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                throw new Exception("PIN must contain only digits.");
            }
        }

        if (pin.charAt(0) == '0') {
            throw new Exception("PIN must not start with 0.");
        }
    }
}
