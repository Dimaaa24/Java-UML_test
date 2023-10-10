package aut.isp.lab5.exercise4;

import java.util.Scanner;

public class TicketsManager implements UserApp,OrganizerApp
{
    private Ticket tickets;
    private int ticketID;
    private User user;
    private Organizer organizer;

    TicketsManager()
    {
        tickets=Ticket.UNINSTANTIATED;
        this.ticketID=0;
        user=new User(1,"Ion");
        organizer=new Organizer(1,"Alex");
    }
    public void PaymentGateway()
    {
        System.out.println("BUYING TICKET!");
        System.out.println("Being redirected to pay for the ticket!");
        System.out.println("Payment Accepted");
    }

    public void GenerateTicket()
    {
        Scanner cin=new Scanner(System.in);
        System.out.println("Input TYPE for new ticket:(1:VIP,2:NORMAL,3:PRIORITY)");
        ticketID=cin.nextInt();
        switch(ticketID)
        {
            case 1:tickets=Ticket.VIP;
            break;
            case 2:tickets=Ticket.NORMAL;
            break;
            case 3:tickets=Ticket.PRIORITY;
            break;
            default:
                System.out.println("WRONG INPUT!");
        }
        System.out.println("BOUGHT A "+tickets.name()+" TICKET");
    }

    public void testGenerateTicket()
    {
        tickets=Ticket.PRIORITY;
    }

    @Override
    public void BuyTicket()
    {
        this.PaymentGateway();
        this.GenerateTicket();
    }

    public void getUser()
    {
        System.out.println("The current user is:");
        System.out.println(user.getID()+" "+user.getName());
    }

    @Override
    public void ViewTicket()
    {
        System.out.println(tickets.toString());
    }

    public String testViewTicket()
    {
        return tickets.toString();
    }

    public void ValidateTicket()
    {
        System.out.println("Input ID for the ticket you are checking:");
        Scanner cin=new Scanner(System.in);
        int id=cin.nextInt();
        if(this.CheckIn(id)==true)
            System.out.println("ALLOWED ENTRY");
        else
            System.out.println("WRONG TICKET ID");
    }

    public String testValidateTicket(int id)
    {
        if(this.CheckIn(id)==true)
            return "ALLOWED ENTRY";
        else
            return "WRONG TICKET ID";
    }

    @Override
    public boolean CheckIn(int ID)
    {
        if(ticketID==ID && ID>0)
            return true;
        return false;
    }

}
