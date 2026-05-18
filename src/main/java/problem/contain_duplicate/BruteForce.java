package problem.contain_duplicate;


//Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class BruteForce {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(target == nums[j]) return true;
            }
        }
        return false;
    }
}
