package web.service;

/**
 * Business logic to handle registration functions.
 * 
 * @author Ahsan.
 */
public class RegistrationService {

    /**
     * Static method to handle user registration.
     * 
     * @param fName The first name of the user.
     * @param lName The last name of the user.
     * @param email The email address of the user.
     * @param dob   The date of birth of the user.
     * @return true if registration is successful, false otherwise.
     */
    public static boolean register(String fName, String lName, String email, String dob) {
        System.out.println("First name: " + fName);
        System.out.println("Last name: " + lName);
        System.out.println("Email: " + email);
        System.out.println("DoB (yyyy-mm-dd): " + dob);
        // Add logic for user registration here, such as database interaction.
        return true; // Placeholder return statement
    }
}
