public class PizzaWithToppings extends PizzaDecorator{
    public PizzaWithToppings(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void getPizza()
    {
        pizza.getPizza();
        addToppings();
    }

    public void addToppings()
    {
        System.out.println("with extraaaaaaaaaa toppings!!!\n");
    }
}
