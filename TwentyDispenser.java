public class TwentyDispenser extends PaperCurrencyDispenser{
    public TwentyDispenser()
    {
        super();
    }

    @Override
    public void dispenser(PaperCurrency currency)
    {
        if(currency != null)
        {
            int amount = currency.getAmount();
            int remainder = amount;

            if(amount >= 20)
            {
                int count = amount / 20;
                remainder = amount % 20;
                System.out.printf("Dispending '%d' 20$ currency note\n",count);
            }
            
            if(remainder > 0 && this.nextDispenser != null)
            {
                this.nextDispenser.dispenser(new PaperCurrency(remainder));
            }
        }
    }
}
