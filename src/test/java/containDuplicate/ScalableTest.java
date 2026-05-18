package containDuplicate;

import org.junit.jupiter.api.Test;
import problem.contain_duplicate.Scaleable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScalableTest {
    Scaleable scaleable = new Scaleable();

    @Test
    void example1(){
        boolean result = scaleable.containsDuplicate(new int[]{1,2,3,1});
        assertEquals(result, true);
    }
    @Test
    void example2(){
        boolean result = scaleable.containsDuplicate(new int[]{1,2,3,4});
        assertEquals(result, false);
    }

    @Test
    void example3(){
        boolean result = scaleable.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        assertEquals(result, true);
    }
}
