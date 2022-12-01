public class MultiCatch {
    public static void main(String args[])
    {
        try{
            int a = args.length;
            System.out.println("a = "+a);

            int b = 42/a;
            int c[] = {1};
            c[42] = 90;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index OOB"+e);
        }

        System.out.println("Line after try/catch block");
    }
}
