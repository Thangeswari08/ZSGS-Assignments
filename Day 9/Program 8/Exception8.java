class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class Exception8 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        try {
            login("user", "1234");
        } catch (AuthenticationException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    static void login(String user, String pass) throws AuthenticationException {
        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new AuthenticationException("Invalid username or password.");
        } else {
            System.out.println("Login successful!");
        }
    }
}
