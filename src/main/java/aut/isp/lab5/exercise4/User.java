package aut.isp.lab5.exercise4;

public class User
{
    private int ID;
    private String name;
    User(int ID,String name)
    {
        this.ID=ID;
        this.name=name;
    }

    public int getID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }
}
