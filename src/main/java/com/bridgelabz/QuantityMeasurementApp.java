package com.bridgelabz;

public class QuantityMeasurementApp {

   public enum LengthUnit {
    FEET(1.0),
    INCH(1.0 / 12.0),          // 1 inch = 1/12 feet
    YARD(3.0),                 // 1 yard = 3 feet
    CM(0.0328084);             // 1 cm ≈ 0.0328084 feet

    private final double toFeet;

    LengthUnit(double toFeet) {
        this.toFeet = toFeet;
    }

    public double toFeet(double value) {
        return value * toFeet;
    }
}

    // Generic Quantity class
    public static class Quantity {
        private final double value;
        private final LengthUnit unit;

        public Quantity(double value, LengthUnit unit) {
            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }
            this.value = value;
            this.unit = unit;
        }

        // Convert to base unit (feet)
        private double toFeet() {
            return unit.toFeet(value);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Quantity other = (Quantity) obj;

            return Double.compare(this.toFeet(), other.toFeet()) == 0;
        }
    }
    // STATIC conversion API
public static double convert(double value, LengthUnit source, LengthUnit target) {

    // Validation
    if (source == null || target == null) {
        throw new IllegalArgumentException("Units cannot be null");
    }

    if (!Double.isFinite(value)) {
        throw new IllegalArgumentException("Invalid numeric value");
    }

    // Convert to base (feet)
    double valueInFeet = source.toFeet(value);

    // Convert to target
    return valueInFeet / target.toFeet(1.0);
}
    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, LengthUnit.FEET);
        Quantity q2 = new Quantity(12.0, LengthUnit.INCH);

        System.out.println("Input: Quantity(1.0, FEET) and Quantity(12.0, INCH)");
        System.out.println("Output: Equal (" + q1.equals(q2) + ")");

        Quantity q3 = new Quantity(1.0, LengthUnit.INCH);
        Quantity q4 = new Quantity(1.0, LengthUnit.INCH);

        System.out.println("Input: Quantity(1.0, INCH) and Quantity(1.0, INCH)");
        System.out.println("Output: Equal (" + q3.equals(q4) + ")");
    }
}