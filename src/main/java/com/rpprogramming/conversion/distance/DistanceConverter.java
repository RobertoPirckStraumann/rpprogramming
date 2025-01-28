package com.rpprogramming.conversion.distance;

public class DistanceConverter {

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double feetsToMeters(double feets) {
        return feets * 0.3048;
    }

    public static double metersToFeets(double meters) {
        return meters * 3.28084;
    }
}
