public class ProxyPatternDemo {
    public static void main(String args[])
    {
        Image img = new ProxyImage("test_10mb.jpg");
    
        //image will be loaded from disk
        img.display();
        System.out.println("_______________________________________");

        //image will not be loaded from disk
        img.display();
        System.out.println("_______________________________________");
    }
}
