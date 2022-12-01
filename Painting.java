public class Painting extends Picture{
    
    String artist,type,owner;

    public Painting(String t, Double p, String art, String ty, String own)
    {
        super(t,p);
        artist = art;
        type = ty;
        owner = own;
    }

    public void display()
    {
        System.out.println("Artist: "+artist);
        System.out.println("Type: "+type);
        System.out.println("Owner: "+owner);
    }

    public void print_provenance()
    {
        System.out.println("This is an original piece of ART!!!");
    }
}
