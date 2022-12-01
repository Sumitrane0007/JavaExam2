public class Subclass extends Superclass {
    public Subclass(int age)
    {
        super(age);
    }

    public static void main(String args[])
    {
        Subclass s = new Subclass(24);
        s.getAge();
    }
}
