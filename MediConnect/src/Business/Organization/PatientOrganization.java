package Business.Organization;

import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

public class PatientOrganization extends Organization {

    public PatientOrganization() {
        super("Patient Organization");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
}
