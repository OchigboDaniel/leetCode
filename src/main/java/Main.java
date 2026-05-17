import problem.twoSum.BruteForce;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BruteForce problem = new BruteForce();

        int[] nums = {2,3,1};
        System.out.println(Arrays.toString(problem.twoSum(nums, 4)));
    }


}
