
package model;

public class Vehicle {
    private final VehicleType type;
    private final double emissionsPerKm;
    private final int kmDriven;

    public Vehicle(VehicleType type, double emissionsPerKm, int kmDriven) {
        if (emissionsPerKm < 0 || kmDriven < 0) {
            throw new IllegalArgumentException("Emissions and distance must be positive.");
        }
        this.type = type;
        this.emissionsPerKm = emissionsPerKm;
        this.kmDriven = kmDriven;
    }

    public double getTotalEmissions() {
        return emissionsPerKm * kmDriven;
    }

    @Override
    public String toString() {
        return "Vehicle{type=" + type + ", emissions=" + getTotalEmissions() + " kg CO2}";
    }
}
