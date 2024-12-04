package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SupplierManagerPanel.SupplierManagerWorkAreaJPanel;

public class SupplierManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
                                 UserAccount account, 
                                 Organization organization, 
                                 Enterprise enterprise, 
                                 EcoSystem business) {
        return new SupplierManagerWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
}
