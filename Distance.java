package com.staticmaven;

public class Distance {

    private final double DISTANCE;

    {
        DISTANCE = 1024.24;
    }

    private static class Converter {
        private static double toMillimeters() {
            Distance millimeters = new Distance();
            return millimeters.DISTANCE * 1000;
        }

        private static double toCentimeters() {
            Distance centimeters = new Distance();
            return centimeters.DISTANCE * 100;
        }

        private static double toDecimeters() {
            Distance decimeters = new Distance();
            return decimeters.DISTANCE * 10;
        }

        private static double toKilometers() {
            Distance kilometers = new Distance();
            return kilometers.DISTANCE * 0.001;
        }

        private static double toMiles() {
            Distance miles = new Distance();
            return miles.DISTANCE * 0.000621371;
        }
        private static double toYard() {
            Distance yard = new Distance();
            return yard.DISTANCE * 1.094;
        }
        private static double toInch() {
            Distance inch = new Distance();
            return inch.DISTANCE * 39.37;
        }
    }

    public double getDISTANCE() {
        return DISTANCE;
    }

    void print() {
        System.out.println("Distance in meter: " + getDISTANCE() + " [m]");
        System.out.println("In Millimeter: " + Converter.toMillimeters() + " [mm]");
        System.out.println("In Centimeter: " + Converter.toCentimeters() + " [cm]");
        System.out.println("In Decimeter: " + Converter.toDecimeters() + " [dm]");
        System.out.println("In Kilometer: " + Converter.toKilometers() + " [km]");
        System.out.println("In Mile: " + Converter.toMiles() + " [мi]");
        System.out.println("In Yard: " + Converter.toYard() + " [yd]");
        System.out.println("In Inch: " + Converter.toInch() + " [in]");

    }
}








