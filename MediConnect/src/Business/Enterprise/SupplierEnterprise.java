package Business.Enterprise;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

public class SupplierEnterprise extends Enterprise {

    public SupplierEnterprise(String name) {
        super(name, EnterpriseType.Supplier);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole()); // Supplier-specific Admin role
        return roles;
    }
}
