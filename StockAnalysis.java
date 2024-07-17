import java.util.ArrayList;
import java.util.List;

public class StockAnalysis {

    // Method to calculate the average stock price
    public static float calculateAveragePrice(int[] stockPrices) {
        int sum = 0;
        for (int price : stockPrices) {
            sum += price;
        }
        return (float) sum / stockPrices.length;
    }

    // Method to find the maximum stock price
    public static int findMaximumPrice(int[] stockPrices) {
        int maxPrice = stockPrices[0];
        for (int price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count the occurrences of a specific price
    public static int countOccurrences(int[] stockPrices, int targetPrice) {
        int count = 0;
        for (int price : stockPrices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute the cumulative sum of stock prices
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> stockPrices) {
        ArrayList<Integer> cumulativeSum = new ArrayList<>();
        int sum = 0;
        for (int price : stockPrices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        int[] stockPricesArray = {100, 110, 105, 115, 120, 125, 130, 140, 135, 145};
        ArrayList<Integer> stockPricesList = new ArrayList<>();
        for (int price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate the average stock price
        float averagePrice = calculateAveragePrice(stockPricesArray);
        System.out.println("Average Stock Price: " + averagePrice);

        // Find the maximum stock price
        int maxPrice = findMaximumPrice(stockPricesArray);
        System.out.println("Maximum Stock Price: " + maxPrice);

        // Determine the occurrence count of a specific price
        int targetPrice = 115;
        int occurrences = countOccurrences(stockPricesArray, targetPrice);
        System.out.println("Occurrences of " + targetPrice + ": " + occurrences);

        // Compute the cumulative sum of stock prices
        ArrayList<Integer> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}

