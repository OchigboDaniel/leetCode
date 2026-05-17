package problem.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class Scalable implements ISolution{



    public int[] twoSum(int[] nums, int target) {

        // value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int newTarget = target - nums[i];

            // if complement already exists
            if (map.containsKey(newTarget)) {
                return new int[]{map.get(newTarget), i};
            }

            // store current value and index
            map.put(nums[i], i);
        }

        return new int[]{};
    }

}
