package containDuplicateII;

import org.junit.jupiter.api.Test;
import problem.contain_duplicate_2.ContainDuplicateII;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainDuplicateIITest {
    ContainDuplicateII containDuplicateII = new ContainDuplicateII();
    @Test
    void exampleI(){
        boolean result = containDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1}, 3);
        assertEquals(result, true);
    }

    @Test
    void exampleII(){
        boolean result = containDuplicateII.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);
        assertEquals(result, true);
    }

    @Test
    void exampleIII(){
        boolean result = containDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2);
        assertEquals(result, false);
    }

}
