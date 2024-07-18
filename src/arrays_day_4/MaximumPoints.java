package arrays_day_4;

public class MaximumPoints {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int point : cardPoints) {
            totalSum += point;
        }

        // If k equals the length of cardPoints, return the total sum
        if (k == n) {
            return totalSum;
        }

        // Calculate the sum of the first n-k elements
        int windowSize = n - k;
        int currentWindowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += cardPoints[i];
        }

        int minWindowSum = currentWindowSum;

        // Slide the window from the start to the end
        for (int i = windowSize; i < n; i++) {
            currentWindowSum = currentWindowSum - cardPoints[i - windowSize] + cardPoints[i];
            minWindowSum = Math.min(minWindowSum, currentWindowSum);
        }

        // Maximum score is total sum minus the minimum sum of the (n-k) elements
        return totalSum - minWindowSum;
    }
    public static void main(String[] args) {

    }
}
