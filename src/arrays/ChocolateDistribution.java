package arrays;

import java.util.Arrays;
public class ChocolateDistribution {
    public static int chocolateDistribution(int arr[], int m) {
        if (arr == null || arr.length == 0 || m <= 0 || m > arr.length) {
            return 0;
        }
        //sort the array
        Arrays.sort(arr);

        // Find the minimum difference using sliding window approach
        int minDifference = Integer.MAX_VALUE;
        for (int i=0;i+m-1<arr.length;i++){
            int difference = arr[i + m - 1] - arr[i];
            minDifference = Math.min(minDifference, difference);
        }
        //found the min difference
        return minDifference;
    }
}
