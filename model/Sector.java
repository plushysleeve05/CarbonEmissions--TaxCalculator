
package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Sector implements Taxable {
    protected final String name;
    protected final List<Appliance> appliances;
    protected final List<Vehicle> vehicles;

    public Sector(String name) {
        this.name = name;
        this.appliances = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
