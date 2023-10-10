package aut.isp.lab5.exercise2;

public class Laptop implements Chargable
{
    private int batteryLevel;

    Laptop()
    {
        batteryLevel=0;
    }
    //setter
    public void setBatteryLevel(int batteryLevel)
    {
        this.batteryLevel=batteryLevel;
    }

    //getter
    @Override
    public int getBatteryLevel()
    {
        return batteryLevel;
    }

    //methods
    @Override
    public void charge(int duration)
    {
        for(int i=0;i<duration;i++)
            batteryLevel++;
        if(batteryLevel>100)
            batteryLevel=100;
        System.out.println("Laptop battery level after chargin for "+duration+" minutes "+getBatteryLevel()+"%");
    }
}
