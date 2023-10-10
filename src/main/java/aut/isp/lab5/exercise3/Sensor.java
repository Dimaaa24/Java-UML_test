package aut.isp.lab5.exercise3;

abstract class Sensor
{
    public String installLocation;
    public String name;

    Sensor(String installLocation,String name)
    {
        this.installLocation=installLocation;
        this.name=name;
    }
}
