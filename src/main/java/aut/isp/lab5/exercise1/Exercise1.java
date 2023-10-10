package aut.isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args)
    {
        Product revlon=new Product("124","blush",12.5,ProductCategory.BEAUTY);
        System.out.println(revlon);
        revlon.addOrder();
        System.out.println(revlon.toString());
    }
}
