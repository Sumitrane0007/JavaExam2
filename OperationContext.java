public class OperationContext {
    private Strategy strategy;

    public OperationContext(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
