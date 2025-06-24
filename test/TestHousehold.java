
package test;

import model.*;

public class TestHousehold {
    public static void main(String[] args) {
        Household home = new Household("Family A");
        home.addAppliance(new Appliance("Fridge", 1.5, 300));
        home.addAppliance(new Appliance("TV", 0.2, 500));
        home.addVehicle(new Vehicle(VehicleType.CAR, 0.25, 12000));

        System.out.println("Total Emissions: " + home.getTotalEmissions() + " kg CO2");
        System.out.println("Carbon Tax: $" + home.computeTax());
    }
}
