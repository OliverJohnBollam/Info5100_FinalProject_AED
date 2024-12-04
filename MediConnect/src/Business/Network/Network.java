package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    // Constructor
    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Enterprise Directory
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    // Override toString for meaningful display
    @Override
    public String toString() {
        return name;
    }
}
