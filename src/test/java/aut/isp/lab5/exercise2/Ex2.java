package aut.isp.lab5.exercise2;
import org.junit.Test;
import org.junit.Assert;

public class Ex2
{
    @Test
    public void TestChargingLaptop()
    {
        Laptop hp=new Laptop();
        hp.charge(10);
        Assert.assertEquals(10,hp.getBatteryLevel());
    }

    @Test
    public void TestChargingPhone()
    {
        SmartPhone hp=new SmartPhone();
        hp.charge(20);
        Assert.assertEquals(40,hp.getBatteryLevel());
    }
    @Test
    public void TestChargingWatch()
    {
        SmartWatch hp=new SmartWatch();
        hp.charge(90);
        Assert.assertEquals(100,hp.getBatteryLevel());
    }


}
