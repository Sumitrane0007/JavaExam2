public class Photograph extends Picture{

    String photographer,camera;
    Double speed,apperture;

    public Photograph(String t, Double p, String pgname, String cam, Double sp, Double app)
    {
        super(t,p);
        photographer = pgname;
        camera = cam;
        speed = sp;
        apperture = app;
    }

    public void display()
    {
        System.out.println("Title: "+title+"\nPrice: "+price);
        System.out.println("Photographer: "+photographer+"\nCamera: "+camera);
        System.out.println("Speed: "+speed+"\nApperture: "+apperture);
    }

    public void alter_contrast()
    {
        System.out.println("Altering contrast!!!");
    }
}
