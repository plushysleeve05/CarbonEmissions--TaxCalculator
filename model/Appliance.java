
package model;

public class Appliance {
    private final String name;
    private final double energyRating; // kWh/day
    private final double price;

    public Appliance(String name, double energyRating, double price) {
        if (energyRating < 0 || price < 0) {
            throw new IllegalArgumentException("Energy rating and price must be positive.");
        }
        this.name = name;
        this.energyRating = energyRating;
        this.price = price;
    }

    public double getEnergyRating() {
        return energyRating;
    }

    @Override
    public String toString() {
        return "Appliance{name='" + name + "', rating=" + energyRating + " kWh/day}";
    }
}