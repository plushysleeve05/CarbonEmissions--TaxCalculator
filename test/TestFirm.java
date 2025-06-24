
package test;

import model.*;

public class TestFirm {
    public static void main(String[] args) {
        Firm company = new Firm("TechCorp");
        company.addAppliance(new Appliance("Server", 5.0, 1000));
        company.addVehicle(new Vehicle(VehicleType.TRUCK, 0.5, 25000));

        System.out.println("Total Emissions: " + company.getTotalEmissions() + " kg CO2");
        System.out.println("Carbon Tax: $" + company.computeTax());
    }
}
