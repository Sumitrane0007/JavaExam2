public class TenDispenser extends PaperCurrencyDispenser{
    public TenDispenser()
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

            if(amount >= 10)
            {
                int count = amount / 10;
                remainder = amount % 10;
                System.out.printf("Dispending '%d' 10$ currency note\n",count);
            }
            
            if(remainder > 0 && this.nextDispenser != null)
            {
                this.nextDispenser.dispenser(new PaperCurrency(remainder));
            }
        }
    }
}
