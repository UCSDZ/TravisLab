package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((getValue() - 32) * 5 / 9);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    @Override
    public String toString() {
        return getValue() + " F";
    }
}
