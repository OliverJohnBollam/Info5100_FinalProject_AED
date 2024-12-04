package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.LabAssistantPanel.LabAssistantWorkAreaJPanel;

public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                 UserAccount account, 
                                 Organization organization, 
                                 Enterprise enterprise, 
                                 EcoSystem business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, 
                                              (LabOrganization) organization, enterprise);
    }
}
