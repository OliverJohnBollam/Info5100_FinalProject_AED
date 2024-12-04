package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

public class LabOrganization extends Organization {

    public LabOrganization() {
        super("Lab Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }
}
