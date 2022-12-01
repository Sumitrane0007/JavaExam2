public class PictureDemo {
    public static void main(String args[])
    {
        Photograph p1 = new Photograph("Monolisa", 5500.00, "Sherwin", "Canon", 5.00, 2.5);
        p1.display();
        p1.update_price(9000.00);
        p1.alter_contrast();
        p1.display();
        
        Painting pa1 = new Painting("Monosila", 5500.00, "Sumit", "Potrait", "Raj");
        pa1.display();
        pa1.print_provenance();
    }
}
