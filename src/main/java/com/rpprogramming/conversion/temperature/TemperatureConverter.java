package com.rpprogramming.conversion.temperature;

public class TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit.
     *
     * @param celsius Temperature in Celsius.
     * @return Temperature in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius.
     *
     * @param fahrenheit Temperature in Fahrenheit.
     * @return Temperature in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
