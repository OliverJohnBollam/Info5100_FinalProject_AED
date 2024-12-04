package Business;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        // Create a network
        Network network = system.createAndAddNetwork();
        network.setName("Global Healthcare Network");

        // Add enterprises to the network
        Enterprise hospital = network.getEnterpriseDirectory().createAndAddEnterprise("City Hospital", EnterpriseType.Hospital);
        Enterprise pharmacy = network.getEnterpriseDirectory().createAndAddEnterprise("City Pharmacy", EnterpriseType.Pharmacy);

        // Add organizations to enterprises
        Organization doctorOrg = hospital.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        Organization patientOrg = hospital.getOrganizationDirectory().createOrganization(Organization.Type.Patient);

        // Add employees to organizations
        Employee doctor = doctorOrg.getEmployeeDirectory().createEmployee("Dr. Smith");
        Employee patient = patientOrg.getEmployeeDirectory().createEmployee("John Doe");

        // Create user accounts
        UserAccount doctorAccount = doctorOrg.getUserAccountDirectory().createUserAccount("dr_smith", "password123", doctor, new DoctorRole());
        UserAccount patientAccount = patientOrg.getUserAccountDirectory().createUserAccount("john_doe", "password456", patient, new PatientRole());

        // Add system admin
        Employee sysAdmin = system.getEmployeeDirectory().createEmployee("System Admin");
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());

        return system;
    }
}
