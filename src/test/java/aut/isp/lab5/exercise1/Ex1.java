package aut.isp.lab5.exercise1;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Ex1
{
    @Test
    public void TestProduct()
    {
        Product revlon=new Product("124","blush",12.5,ProductCategory.BEAUTY);
        LocalDate y=LocalDate.now();
        revlon.TestaddOrder();
        Assert.assertEquals("Product{ProductId:124,name:blush,price:12.5$,ProductCategory:Beauty,Orders:[69 "+y+" 2.3$],Customer:1 ION 69696 Sibiu STR IDKx",revlon.toString());

    }
}