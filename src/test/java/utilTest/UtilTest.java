package utilTest;

import org.junit.jupiter.api.Test;
import problem.twoSum.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest {

    private Utils utils;

    @Test()
    void binerySearch(){
        int[] nums = {1,2,3,4,5,5,6,242};
        int result = utils.binarySearch(nums, 0, nums.length -1, 242);
        assertEquals(7, result);
    }
}
