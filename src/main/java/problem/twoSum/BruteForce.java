package problem.twoSum;

public class BruteForce {
    public int[] twoSum(int[] nums, int target) {

        // loop through the array
        for (int i = 0; i < nums.length; i++){
            // store the new target value
            int newTarget = target - nums[i];

            //loop through the rest of the array
            for (int j = i + 1; j < nums.length; j++){
                //is j is equal to the new target, we have got our answer
                if(nums[j] == newTarget) return new int[]{i,j};
            }
        }
        // if not found return an empty array
        return new int[]{};
    }
}
