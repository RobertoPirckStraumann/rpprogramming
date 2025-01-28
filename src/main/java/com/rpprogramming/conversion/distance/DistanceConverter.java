package com.rpprogramming.conversion.distance;

public class DistanceConverter {

    /**
     * Converts a distance from kilometers to miles.
     *
     * @param kilometers the distance in kilometers to be converted
     * @return Distance in miles
     */
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    /**
     * Converts a distance from miles to kilometers.
     *
     * @param miles the distance in miles to be converted
     * @return Distance in kilometers
     */
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    /**
     * Converts a distance from feet to meters.
     *
     * @param feets the distance in feet to be converted
     * @return Distance in meters
     */
    public static double feetsToMeters(double feets) {
        return feets * 0.3048;
    }

    /**
     * Converts a distance from meters to feet.
     *
     * @param meters the distance in meters to be converted
     * @return Distance in feet
     */
    public static double metersToFeets(double meters) {
        return meters * 3.28084;
    }

}
