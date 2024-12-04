/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private String name;
    private List<Enterprise> enterprises;

    public Network(String name) {
        this.name = name;
        this.enterprises = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void addEnterprise(Enterprise enterprise) {
        this.enterprises.add(enterprise);
    }

    @Override
    public String toString() {
        return "Network{" +
               "name='" + name + '\'' +
               ", enterprises=" + enterprises +
               '}';
    }
}

