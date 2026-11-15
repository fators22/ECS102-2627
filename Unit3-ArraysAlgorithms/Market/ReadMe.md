Lab: Real-Time Financial Monitor
 classes, while loops, if/else, running totals
Name: _______________________________     Period: ______     Date: ____________
Overview
A trading app shows a coin’s current price, its high and low for the session, and its average price, and it updates every time a new trade comes in. The data never stops arriving, so the app cannot wait for "all" of it, and it does not save every price it has ever seen.
You will build that monitor as a class. A MarketMonitor object keeps six instance variables and updates them each time it is given a new line from a live, never-ending price stream. A runner program reads the stream in a while loop and passes each line to the monitor.
Rule: No arrays or ArrayLists, and that includes split(), which returns an array. You may not store price history. Every statistic must come from your instance variables.
Files
File
What it is
PriceFeed.java
The simulated market stream. Do not edit it.
MarketMonitor.java
The class you write: instance variables, constructor, and methods.
MonitorRunner.java
The program you run. It contains main and the while loop.

Keep all three files in the same folder in VS Code. Run MonitorRunner.java.
The Stream
Every line of the stream has two numbers separated by a space: PRICE TICK_CHANGE
64000.00 +0.00
64146.16 +146.16
64264.11 +117.95
64142.03 -122.08
PRICE is the newest trade price.
TICK_CHANGE is how much the price moved since the previous line. The first line is always +0.00.
Create a PriceFeed object one of two ways:
Code
What it does
new PriceFeed("BTC")
Live mode. A new line every half second, forever. Stop it with Ctrl+C or the stop button.
new PriceFeed(42, 10)
Test mode. The same 10 lines every time, then the stream ends. Use it to check your answers.

Other symbols: "ETH", "AAPL", "TSLA".
Reading the stream: feed.readLine() is a PriceFeed method that returns the next line as a String. When a stream ends, it returns null. A live stream never ends, so your loop keeps running.
Part A: The MarketMonitor Class
UML Class Diagram
MarketMonitor
- currentPrice : double
- tickChange : double
- highestPrice : double
- lowestPrice : double
- totalTicks : int
- priceSum : double
+ MarketMonitor()
+ processTick(line : String) : void
+ getCurrentPrice() : double
+ getHighestPrice() : double
+ getLowestPrice() : double
+ getTotalTicks() : int
+ getAveragePrice() : double
+ toString() : String

- private   + public
Steps (TODO 1–7)
Instance variables: declare all six from the UML as private.
Constructor: set each one to 0.
Parse (processTick): find the space with indexOf(" "), pull out each number with substring(), and convert both with Double.parseDouble(). Do not use split().
Count and total (processTick): add 1 to totalTicks and add currentPrice to priceSum.
High and low (processTick): use if / else if to update highestPrice and lowestPrice. Think carefully about the first tick: what should the high and low be before you have compared anything?
Accessors: complete the four get methods and getAveragePrice(), which returns priceSum / totalTicks (or 0.0 if totalTicks is 0).
toString: return the dashboard line with String.format(). Use %,.2f for money (adds commas) and %+.2f for the tick change (always shows + or -).
Part B: MonitorRunner (TODO 8–9)
Create a MarketMonitor object.
Loop: while line is not null, pass it to processTick, print the monitor (this calls toString), and read the next line.
Expected Output
Tick 1 | Price: $64,000.00 (+0.00) | High: $64,000.00 | Low: $64,000.00 | Avg: $64,000.00
Tick 2 | Price: $64,146.16 (+146.16) | High: $64,146.16 | Low: $64,000.00 | Avg: $64,073.08
Tick 3 | Price: $64,264.11 (+117.95) | High: $64,264.11 | Low: $64,000.00 | Avg: $64,136.76
Tick 4 | Price: $64,142.03 (-122.08) | High: $64,264.11 | Low: $64,000.00 | Avg: $64,138.08
Tick 5 | Price: $64,000.02 (-142.01) | High: $64,264.11 | Low: $64,000.00 | Avg: $64,110.46
Checkpoint
Switch to new PriceFeed(42, 10). Your last line must show:
Final Price
High
Low
Average
$63,815.66
$64,264.11
$63,815.66
$64,038.65

If your numbers match, switch back to live mode and watch it run.
Questions
Answer in complete sentences in a comment block at the top of MarketMonitor.java.
You found the highest, lowest, and average price of a stream that never ends, without an array. Explain how that is possible.
A classmate initializes lowestPrice = 0 in the constructor and has no first-tick case. What will their program print for Low, and why?
What happens if you forget to read the next line at the bottom of the loop in MonitorRunner?
Why are currentPrice, highestPrice, and the others instance variables instead of local variables inside processTick?
Could you find the median price this way, with only tracking variables? Why or why not?
Extensions (optional)
Add new instance variables and update them in processTick.
Count up ticks and down ticks separately. Add a method that returns which one is winning.
Track the biggest single-tick jump (largest absolute TICK_CHANGE).
Add a boolean method isAlert() that returns true when the current price is more than 0.5% above or below the average. Print ALERT in the runner when it is true.
Track the longest streak of consecutive up ticks.
Grading (10 points)
Criteria
Points
Private instance variables with correct types; constructor initializes them
1
processTick separates the line with indexOf/substring and parses both doubles
1
High and low are correct, including the first tick (if / else if)
2
Accessors and getAveragePrice are correct
1
toString matches the dashboard format
1
MonitorRunner creates the object and loops until null, reading the next line each pass
3
Questions answered
1
Total
10



