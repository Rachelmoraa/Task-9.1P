package web.service;

/**
 * Service class for handling login functionality.
 * 
 * @author Ahsan.
 */
public class LoginService {

    /**
     * Validates the login credentials.
     * 
     * @param username The username.
     * @param password The password.
     * @param dob      The date of birth.
     * @return true if login is successful, false otherwise.
     */
    public static boolean login(String username, String password, String dob) {
        // Match a fixed user name and password.
        //
        if ("ahsan".equals(username) && "ahsan_pass".equals(password)) {
            return true;
        }
        return false;
    }
}
