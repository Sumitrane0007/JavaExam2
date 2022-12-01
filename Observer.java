public class Observer {
    public static void main(String args[])
    {
        //create objects for testing
        CurrentSCoreDisplay currentSCoreDisplay = new CurrentSCoreDisplay();
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        
        //pass the display to cricket data
        CricketData cricketData = new CricketData(currentSCoreDisplay, averageScoreDisplay);

        //in real app you would have some logic to call this function when data changes
        cricketData.dataChange();
    }
}
