package aut.isp.lab5.exercise3;
import java.util.ArrayList;
import java.util.Scanner;

public class MonitoringService
{
    private ArrayList<Sensor> sensors=new ArrayList<Sensor>();
    private int nr_tempsensors;
    private int nr_pressuresensors;

    MonitoringService(int nr_temp,int nr_press)
    {
        nr_tempsensors=nr_temp;
        nr_pressuresensors=nr_press;
        for(int i=0;i<nr_temp;i++) {
            TemperatureSensor x = new TemperatureSensor("nonini", "x");
            sensors.add(x);
        }
        for(int i=nr_temp;i<nr_press+nr_temp;i++)
        {
            PressureSensor x=new PressureSensor("nonini","x");
            sensors.add(x);
        }
    }

    public int getNr_tempsensors()
    {
        return nr_tempsensors;
    }

    public int getNr_pressuresensors() {
        return nr_pressuresensors;
    }

    public void setSensorPressure(int i, double pressure)
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("Input name,location:");
        String name=cin.next();
        String location=cin.next();
        PressureSensor x=new PressureSensor(location,name);
        x.setPressure(pressure);
        sensors.set(i,x);
    }

    public void TestsetSensorPressure(int i, double pressure)
    {
        PressureSensor x=new PressureSensor("x","y");
        x.setPressure(pressure);
        sensors.set(i,x);
    }

    public void setSensorTemperature(int i,double temperature)
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("Input name,location:");
        String name=cin.next();
        String location=cin.next();
        TemperatureSensor x=new TemperatureSensor(location,name);
        x.setTemperature(temperature);
        sensors.set(i,x);
    }

    public void TestsetSensorTemperature(int i,double temperature)
    {
        TemperatureSensor x=new TemperatureSensor("x","y");
        x.setTemperature(temperature);
        sensors.set(i,x);
    }

    public double getAverageTemperatureSensors()
    {
        double average=0;
        for(int i=0;i<nr_tempsensors;i++)
        {
            TemperatureSensor x=(TemperatureSensor) sensors.get(i);
            average+=x.getTemperature();
        }
        return average/nr_tempsensors;
    }

    public void getAverageAllSensors() {
        double temp_average = 0;
        double pressure_average = 0;
        for(int i=0;i<nr_tempsensors;i++)
        {
            TemperatureSensor x=(TemperatureSensor) sensors.get(i);
            temp_average+=x.getTemperature();
        }
        for(int i=nr_tempsensors;i<nr_tempsensors+nr_pressuresensors;i++)
        {
            PressureSensor x=(PressureSensor) sensors.get(i);
            pressure_average+=x.getPressure();
        }
        System.out.printf("Average pressure: %.2f \t Average temperature: %.2f", pressure_average / nr_pressuresensors, temp_average / nr_tempsensors);
    }

    public String TestAverageAll()
    {
        double temp_average = 0;
        double pressure_average = 0;
        for(int i=0;i<nr_tempsensors;i++)
        {
            TemperatureSensor x=(TemperatureSensor) sensors.get(i);
            temp_average+=x.getTemperature();
        }
        for(int i=nr_tempsensors;i<nr_tempsensors+nr_pressuresensors;i++)
        {
            PressureSensor x=(PressureSensor) sensors.get(i);
            pressure_average+=x.getPressure();
        }
        return "Average pressure:"+pressure_average/nr_pressuresensors+"\t Average temperature:"+temp_average/nr_tempsensors;
    }
}
