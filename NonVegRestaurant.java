public class NonVegRestaurant implements Hotel{
    
    @Override
    public Menu getMenu()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
