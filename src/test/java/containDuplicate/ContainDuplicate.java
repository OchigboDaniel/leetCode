package containDuplicate;

import org.junit.jupiter.api.Test;
import problem.contain_duplicate.BruteForce;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainDuplicate {
    private BruteForce bruteForce = new BruteForce();

    @Test
    void example1(){
        boolean result = bruteForce.containsDuplicate(new int[]{1,2,3,1});
        assertEquals(result, true);
    }
    @Test
    void example2(){
        boolean result = bruteForce.containsDuplicate(new int[]{1,2,3,4});
        assertEquals(result, false);
    }

    @Test
    void example3(){
        boolean result = bruteForce.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        assertEquals(result, true);
    }
}
