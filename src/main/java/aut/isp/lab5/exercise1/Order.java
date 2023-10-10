package aut.isp.lab5.exercise1;

import java.time.LocalDate;

public class Order
{
    private String orderId;
    private LocalDate date;
    private double totalPrice;

    Order(String orderId,LocalDate date,double totalPrice)
    {
        this.orderId=orderId;
        this.date=date;
        this.totalPrice=totalPrice;
    }
    @Override
    public String toString()
    {
        return orderId+" "+date+" "+totalPrice+"$";
    }

}
