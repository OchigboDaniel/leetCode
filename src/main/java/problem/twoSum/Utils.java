package problem.twoSum;

import java.util.Arrays;

public class Utils {
    public static int binarySearch(int[] nums, int left, int right, int target) {

        //safety
        if (left > right) return -1;



        //middle index
        int mid = left + (right - left) / 2;


        if (nums[mid] == target) return mid;

        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else {
            return binarySearch(nums, left, mid - 1, target);
        }
    }
}
