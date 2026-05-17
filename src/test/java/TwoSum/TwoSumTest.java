package TwoSum;

import org.junit.jupiter.api.Test;
import problem.twoSum.BruteForce;
import problem.twoSum.Scalable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    BruteForce problem = new BruteForce();
    Scalable scalable = new Scalable();
    int[] result;

    @Test()
    void exampleOne(){
        //result = problem.twoSum(new int[]{2,7,11,15}, 9);
        result = scalable.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(result, new int[]{0,1});
    }

    @Test()
    void exampleTwo(){
        //result = problem.twoSum(new int[]{3,2,4},6);
        result = scalable.twoSum(new int[]{3,2,4},6);
        assertArrayEquals(result, new int[]{1,2});
    }

    @Test()
    void exampleThree(){
        //result = problem.twoSum(new int[]{3,3},6);
        result = scalable.twoSum(new int[]{3,3},6);
        assertArrayEquals(result, new int[]{0,1});
    }


}
