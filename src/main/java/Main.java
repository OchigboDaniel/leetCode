import problem.twoSum.BruteForce;
import problem.twoSum.Scalable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scalable scalable = new Scalable();

        int[] nums = {3,2,4};
        System.out.println(Arrays.toString(scalable.twoSum(nums,6)));
    }


}
