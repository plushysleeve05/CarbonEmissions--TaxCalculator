
package model;

public class Tax {
    private static final double THRESHOLD = 1000.0;
    private static final double RATE = 0.05;

    public static double compute(double emissions) {
        return emissions > THRESHOLD ? (emissions - THRESHOLD) * RATE : 0.0;
    }
}
