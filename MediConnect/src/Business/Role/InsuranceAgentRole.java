package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClaimsManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.InsuranceAgentPanel.InsuranceAgentWorkAreaJPanel;

public class InsuranceAgentRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                 UserAccount account, 
                                 Organization organization, 
                                 Enterprise enterprise, 
                                 EcoSystem business) {
        return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, 
                                                (ClaimsManagementOrganization) organization, enterprise);
    }
}
