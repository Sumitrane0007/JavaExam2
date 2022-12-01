public class VegRestaurant implements Hotel{
    
    @Override
    public Menu getMenu()
    {
        VegMenu v = new VegMenu();
        return v;
    }
}
