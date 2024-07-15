package arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroFoundAt = 0;

        // Move all the non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        for (int i = lastNonZeroFoundAt; i < n; i++) {
            nums[i] = 0;
        }
    }
}
