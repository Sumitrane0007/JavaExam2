public class StrategyPatternDemo {
    public static void main(String args[])
    {
        OperationContext operationContext = new OperationContext(new OperationAdd());
        System.out.println("10 + 5 = "+operationContext.execute(10, 5));

        operationContext = new OperationContext(new OperationSubstract());
        System.out.println("10 - 5 = "+operationContext.execute(10, 5));

        operationContext = new OperationContext(new OperationMultiply());
        System.out.println("10 * 5 = "+operationContext.execute(10, 5));
    }
}
