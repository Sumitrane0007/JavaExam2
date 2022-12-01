public class TryCatch {
    public static void main(String args[])
    {
        int d,a;
        try{
            d = 0;
            a = 42/d;
            System.out.println("Value of A is : "+a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
    }
}
