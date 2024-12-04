package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type == Type.Doctor) {
            organization = new DoctorOrganization();
        } else if (type == Type.Lab) {
            organization = new LabOrganization();
        } else if (type == Type.Inventory) {
            organization = new InventoryManagementOrganization();
        } else if (type == Type.Pharmacy) {
            organization = new PharmacyOrganization();
        } else if (type == Type.Claims) {
            organization = new ClaimsManagementOrganization();
        } else if (type == Type.PolicySales) {
            organization = new PolicySalesOrganization();
        } else if (type == Type.Patient) { // Add Patient Organization
            organization = new PatientOrganization();
        }

        if (organization != null) {
            organizationList.add(organization);
        }

        return organization;
    }
}
