import java.util.Scanner;
public class Rectester {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("Enter length of the rectangle: ");
        r.setL(s.nextDouble());

        System.out.println("Enter breadth of the rectangle: ");
        r.setB(s.nextDouble());

        r.calcArea();
        double a = r.getArea();
        System.out.println("Area is "+a);

        s.close();
    }
}
