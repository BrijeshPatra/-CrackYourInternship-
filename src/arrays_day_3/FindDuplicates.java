package arrays_day_3;

import java.util.*;
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>duplicates=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;

            if(nums[idx]<0){
                duplicates.add(Math.abs(nums[i]));
            }else{
                nums[idx]=-nums[idx];
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {

    }
}
