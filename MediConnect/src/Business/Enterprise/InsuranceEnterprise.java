package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

public class InsuranceEnterprise extends Enterprise {

    public InsuranceEnterprise(String name) {
        super(name, EnterpriseType.Insurance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole()); // Insurance-specific Admin role
        return roles;
    }
}
