package org.example;

public class Converter {

    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        // If the result is exactly 1.0, use "lb" instead of "lbs"
        if (pounds == 1.0) {
            return String.format("%.4f lb", pounds);
        } else {
            return String.format("%.4f lbs", pounds);
        }
    }

    public String toPoundsAndOunces(int ounces) {
        int lbs = ounces / 16;
        int oz = ounces % 16;
        if (lbs == 1) {
            return String.format("%d lb %d oz", lbs, oz);
        } else {
            return String.format("%d lbs %d oz", lbs, oz);
        }
    }
}