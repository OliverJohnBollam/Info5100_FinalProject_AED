/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private String name;
    private String type; // Hospital, Pharmacy, etc.
    private List<Organization> organizations;

    public Enterprise(String name, String type) {
        this.name = name;
        this.type = type;
        this.organizations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void addOrganization(Organization organization) {
        this.organizations.add(organization);
    }

    @Override
    public String toString() {
        return "Enterprise{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", organizations=" + organizations +
               '}';
    }
}

