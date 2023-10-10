package aut.isp.lab5.exercise3;

public class PressureSensor extends Sensor
{
    private double pressure;

    PressureSensor(String installloc,String name)
    {
        super(installloc,name);
        pressure=0;
    }

    public void setPressure(double pressure)
    {
        this.pressure=pressure;
    }

    public double getPressure()
    {
        return pressure;
    }
}
