package arrays_day_4;

import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort the array first
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the fixed element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            //Initialise left and right->2 pointer approach
            int left = i + 1;
            int right = nums.length - 1;

            //check when left is less than right
            while (left < right) {
                //calculate sum
                int sum = nums[i] + nums[left] + nums[right];

                //if sum is 0 add it to result
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //check when left is less than right and its curr ele and next
                    //ele are equal increment left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    //check when left is less than right and its curr ele and prev
                    //ele are equal decrement right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
