package aut.isp.lab5.exercise2;
import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
        Laptop hp=new Laptop();
        SmartPhone iph=new SmartPhone();
        SmartWatch appl=new SmartWatch();
        System.out.println("Laptop battery at:"+hp.getBatteryLevel()+"%");
        System.out.println("Phone battery at:"+iph.getBatteryLevel()+"%");
        System.out.println("Watch battery at:"+appl.getBatteryLevel()+"%");
        Scanner cin=new Scanner(System.in);
        System.out.println("How long do you want to charge the devices?");
        int time=cin.nextInt();
        hp.charge(time);
        iph.charge(time);
        appl.charge(time);
    }

}
