public class MarketMonitor {
    public String toString()
    {
        return String.format("Tick %d | Price: $%,.2f (%+.2f) | High: $%,.2f | Low: $%,.2f | Avg: $%,.2f",
                totalTicks, currentPrice, tickChange, highestPrice, lowestPrice, getAveragePrice());
    }
}
