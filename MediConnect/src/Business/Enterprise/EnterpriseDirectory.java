package Business.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    // Create and add enterprises of different types
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;

        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Supplier) {
            enterprise = new SupplierEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Insurance) {
            enterprise = new InsuranceEnterprise(name);
        } else if (type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new PharmacyEnterprise(name);
        }

        if (enterprise != null) {
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
