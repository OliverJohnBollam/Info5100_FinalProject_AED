package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole()); // Add the Admin role
        return roles;
    }
}
