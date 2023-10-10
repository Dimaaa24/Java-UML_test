package aut.isp.lab5.exercise3;

import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        MonitoringService monitor=new MonitoringService(4,6);
        //temp and pressure will be 0 for all sensors when calling constructors
        for (int i = 0; i < monitor.getNr_tempsensors(); i++) {
            System.out.printf("Input the temperature for sensor " + (i + 1) + ":");
            double temp=cin.nextDouble();
            monitor.setSensorTemperature(i,temp);
        }
        for (int i = monitor.getNr_tempsensors(); i < monitor.getNr_tempsensors()+monitor.getNr_pressuresensors(); i++)
        {
            System.out.printf("Input the pressure for sensor " + (i - monitor.getNr_tempsensors()+1) + ":");
            double pressure=cin.nextDouble();
            monitor.setSensorPressure(i,pressure);
        }
        System.out.println("Average temp is:"+monitor.getAverageTemperatureSensors());
        monitor.getAverageAllSensors();
    }
}
