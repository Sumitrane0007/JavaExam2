public class Picture {
    String title;
    Double price;

    public Picture(String name ,Double cash)
    {
        title=name;
        price=cash;
    }

    public void display()
    {
        System.out.println("This is a Picture of "+title+" \nThe Price is of this Picture is "+price+" Rs");
    }

    public void update_price(Double p)
    {
        price=p;
        System.out.println("Price Updated!!!");
    }
}
