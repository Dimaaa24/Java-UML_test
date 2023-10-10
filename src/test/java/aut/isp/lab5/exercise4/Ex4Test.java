package aut.isp.lab5.exercise4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class Ex4Test
{
    @Test
    public void testgenerate()
    {
        TicketsManager manager = new TicketsManager();
        manager.testGenerateTicket();
        Assert.assertEquals("3 priority ticket",manager.testViewTicket());
    }
    @Test
    public void testCheckIn()
    {
        TicketsManager manager = new TicketsManager();
        manager.testGenerateTicket();
        Assert.assertEquals("WRONG TICKET ID",manager.testValidateTicket(1));
    }
}
