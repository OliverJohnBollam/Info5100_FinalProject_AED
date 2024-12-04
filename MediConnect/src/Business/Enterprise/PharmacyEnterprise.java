package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

public class PharmacyEnterprise extends Enterprise {

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole()); // Pharmacy-specific Admin role
        return roles;
    }
}
