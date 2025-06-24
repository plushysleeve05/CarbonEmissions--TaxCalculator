
package model;

public class Household extends Sector {
    public Household(String name) {
        super(name);
    }

    @Override
    public double getTotalEmissions() {
        double total = 0;
        for (Appliance a : appliances) {
            total += a.getEnergyRating() * 365;
        }
        for (Vehicle v : vehicles) {
            total += v.getTotalEmissions();
        }
        return total;
    }

    @Override
    public double computeTax() {
        return Tax.compute(getTotalEmissions());
    }
}
