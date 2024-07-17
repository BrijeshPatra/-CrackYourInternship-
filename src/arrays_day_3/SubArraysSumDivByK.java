package arrays_day_3;

import java.util.*;
public class SubArraysSumDivByK {
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);
        int prefix_sum = 0;
        int count = 0;

        for (int num : nums) {
            prefix_sum += num;
            int remainder = ((prefix_sum % k) + k) % k; // To handle negative remainders

            if (remainderCount.containsKey(remainder)) {
                count += remainderCount.get(remainder);
            }

            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 0, -2, -3, 1};
        int k1 = 5;
        System.out.println(subarraysDivByK(nums1, k1)); // Output: 7

        int[] nums2 = {5, 10, 11, 12};
        int k2 = 5;
        System.out.println(subarraysDivByK(nums2, k2)); // Output: 6
    }
}
