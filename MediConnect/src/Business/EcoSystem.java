package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    // Singleton pattern to get the instance of EcoSystem
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    // Constructor
    private EcoSystem() {
        super("EcoSystem");
        networkList = new ArrayList<>();
    }

    // Create and add a new network
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    // Check if a username is unique across the system
    public boolean checkIfUserIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
