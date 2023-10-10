package aut.isp.lab5.exercise3;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Ex3Test
{
    @Test
    public void TestTemp()
    {
        MonitoringService monitor=new MonitoringService(4,6);
        monitor.TestsetSensorTemperature(0,24.3);
        monitor.TestsetSensorTemperature(1,23.5);
        monitor.TestsetSensorTemperature(2,21.3);
        monitor.TestsetSensorTemperature(3,22.5);
        Assert.assertEquals(22.9,monitor.getAverageTemperatureSensors(),0.01);
    }
    @Test
    public void TestAll()
    {
        MonitoringService monitor=new MonitoringService(4,6);
        monitor.TestsetSensorTemperature(0,24.3);
        monitor.TestsetSensorTemperature(1,23.5);
        monitor.TestsetSensorTemperature(2,21.3);
        monitor.TestsetSensorTemperature(3,22.5);
        monitor.TestsetSensorPressure(4,1.3);
        monitor.TestsetSensorPressure(5,2);
        monitor.TestsetSensorPressure(6,3);
        monitor.TestsetSensorPressure(7,4.5);
        monitor.TestsetSensorPressure(8,4);
        monitor.TestsetSensorPressure(9,2.9);
        Assert.assertEquals("Average pressure:2.9499999999999997\t Average temperature:22.9",monitor.TestAverageAll());
    }
}
