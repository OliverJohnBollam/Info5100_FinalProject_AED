package Business.Organization;

import Business.Role.InventoryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

public class InventoryManagementOrganization extends Organization {

    public InventoryManagementOrganization() {
        super("Inventory Management");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManagerRole());
        return roles;
    }
}
