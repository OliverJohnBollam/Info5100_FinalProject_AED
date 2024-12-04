package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    // Constructor
    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    // Getter for UserAccount List
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    // Authenticate user based on username and password
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    // Create a new user account
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    // Check if a username is unique
    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
