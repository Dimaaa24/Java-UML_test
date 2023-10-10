package aut.isp.lab5.exercise1;

public class Address
{
    private String street;
    private String city;

    Address()
    {
        city="Sibiu";
        street="STR IDKx";
    }

    @Override
    public String toString()
    {
        return city+" "+street;
    }
}
