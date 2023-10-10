package aut.isp.lab5.exercise2;

public class SmartPhone implements Chargable
{
    private int batteryLevel;

    SmartPhone()
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
            batteryLevel+=2;
        if(batteryLevel>100)
            batteryLevel=100;
        System.out.println("SmartPhone battery level after chargin for "+duration+" minutes "+getBatteryLevel()+"%");
    }
}
