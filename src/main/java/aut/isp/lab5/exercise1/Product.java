package aut.isp.lab5.exercise1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

public class Product
{
    private String productId;
    private String name;
    private double price;
    private ProductCategory ProductCategory;
    private ArrayList<Order> products=new ArrayList<>(10);
    private Customer customer;

    public Product(String productId,String name,double price,ProductCategory ProductCategory)
    {
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.ProductCategory=ProductCategory;
        this.customer=new Customer();
    }
    //setters
    public void setProductId(String productId)
    {
        this.productId=productId;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public void addOrder()
    {
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {System.out.println("Input order details:");
        System.out.println("OrderId:");
        String x=cin.next();
        LocalDate y=LocalDate.now();
        System.out.println("Price");
        Double price=cin.nextDouble();
        Order test=new Order(x,y,price);
        products.add(test);}
    }

    public void TestaddOrder()
    {
        LocalDate y=LocalDate.now();
        Order test=new Order("69",y,2.3);
        products.add(test);
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getProductCategory()
    {
        return ProductCategory;
    }

    public ArrayList<Order> getProducts()
    {
        return products;
    }

    @Override
    public String toString()
    {
        return "Product{ProductId:"+productId+",name:"+name+",price:"+price+"$,ProductCategory:"+ProductCategory+",Orders:"+products.toString()+",Customer:"+customer.toString();

    }
}

