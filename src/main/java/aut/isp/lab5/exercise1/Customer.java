package aut.isp.lab5.exercise1;

public class Customer
{
    private String customerId;
    private String name;
    private String phone;
    private Address address;

    Customer()
    {
        customerId="1";
        name="ION";
        phone="69696";
        address=new Address();
    }
    Customer(String customerId,String name,String phone,Address address)
    {
        this.customerId=customerId;
        this.name=name;
        this.phone=phone;
        this.address=address;
    }
    @Override
    public String toString()
    {
        return customerId+" "+name+" "+phone+" "+address.toString();
    }
}
