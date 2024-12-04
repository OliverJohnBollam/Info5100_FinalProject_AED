package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {
    
    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Pharmacist("Pharmacist"),
        InventoryManager("Inventory Manager"),
        InsuranceAgent("Insurance Agent"),
        SupplierManager("Supplier Manager"),
        SystemAdmin("System Admin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
                                          UserAccount account, 
                                          Organization organization, 
                                          Enterprise enterprise, 
                                          EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
