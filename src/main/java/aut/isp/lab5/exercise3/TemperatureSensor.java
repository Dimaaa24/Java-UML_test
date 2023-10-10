package aut.isp.lab5.exercise3;

public class TemperatureSensor extends Sensor
{
    private double temperature;

    TemperatureSensor(String installloc,String name)
    {
        super(installloc,name);
        temperature=0;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
