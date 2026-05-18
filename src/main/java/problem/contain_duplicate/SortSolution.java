package problem.contain_duplicate;

import java.util.Arrays;

public class SortSolution implements ISolution{

    public  boolean containsDuplicate(int[] nums) {
        //Sort the array
        Arrays.sort(nums);
        //check if the next 2 values are the same
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
