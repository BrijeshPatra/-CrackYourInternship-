package arrays_day_2;

import java.util.Arrays;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {

        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while (slow!=fast);

        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
    }
}
