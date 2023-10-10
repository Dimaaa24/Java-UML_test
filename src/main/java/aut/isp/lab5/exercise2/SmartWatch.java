package aut.isp.lab5.exercise2;

public class SmartWatch implements Chargable
{
    private int batteryLevel;

    SmartWatch()
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
            batteryLevel+=3;
        if(batteryLevel>100)
            batteryLevel=100;
        System.out.println("SmartWatch battery level after chargin for "+duration+" minutes "+getBatteryLevel()+"%");
    }
}
