import org.junit.jupiter.api.Test;
import problem.twoSum.BruteForce;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    BruteForce problem = new BruteForce();
    int[] result;

    @Test()
    void exampleOne(){
        result = problem.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(result, new int[]{0,1});
    }

    @Test()
    void exampleTwo(){
        result = problem.twoSum(new int[]{3,2,4},6);
        assertArrayEquals(result, new int[]{1,2});
    }

    @Test()
    void exampleThree(){
        result = problem.twoSum(new int[]{3,3},6);
        assertArrayEquals(result, new int[]{0,1});
    }


}
