package aut.isp.lab5.exercise4;

public enum Ticket
{
    UNINSTANTIATED(0,"no ticket"),
    NORMAL(1,"normal ticket"),
    VIP(2,"vip ticket"),
    PRIORITY(3,"priority ticket");

    private int ID;
    private String name;

    Ticket(int ID,String name)
    {
        this.ID=ID;
        this.name=name;
    }

    @Override
    public String toString()
    {
        return this.ID+" "+this.name;
    }
}
