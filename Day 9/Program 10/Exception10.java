class IneligibleVoterException extends Exception {
    public IneligibleVoterException(String message) {
       super(message);
   }
}

public class Exception10 {
    public static void main(String[] args) {
        registerToVote(16);
        registerToVote(20);
    }

    static void registerToVote(int age) {
        try {
            if (age < 18) {
                throw new IneligibleVoterException("You must be 18 or older to vote.");
            }
        else{
            System.out.println("You are eligible to vote.");
            }
        } catch (IneligibleVoterException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
