package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.InventoryManagerPanel.InventoryManagerWorkAreaJPanel;

public class InventoryManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                 UserAccount account, 
                                 Organization organization, 
                                 Enterprise enterprise, 
                                 EcoSystem business) {
        return new InventoryManagerWorkAreaJPanel(userProcessContainer, account, 
                                                  (InventoryManagementOrganization) organization, enterprise);
    }
}
