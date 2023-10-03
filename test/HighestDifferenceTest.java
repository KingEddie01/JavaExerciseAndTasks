import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HighestDifferenceTest {
    @Test
    public void testForHighestDifference() {
        HighestDifference highestDifference = new HighestDifference();
        int [] values = {5, 18, 32, 3, 4};
        int result = highestDifference.getHighestDifference(values);
        assertEquals(29, result);

    }

}
