package Business.Organization;

import Business.Role.InsuranceAgentRole;
import Business.Role.Role;
import java.util.ArrayList;

public class PolicySalesOrganization extends Organization {

    public PolicySalesOrganization() {
        super("Policy Sales");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InsuranceAgentRole());
        return roles;
    }
}
