import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SecondLargestTest{
    @Test
    public void testToGetSecondLargestNumber(){
        SecondLargest secondLargest = new SecondLargest();
        secondLargest.secondLargest("ABC12345DF");
        assertEquals(4, secondLargest.getSecondLargestNumber());
    }
    @Test
    public void testToGetSecondLargestNumberForSameNumbers(){
        SecondLargest secondLargest = new SecondLargest();
        secondLargest.secondLargest("ABC55555DF");
        assertEquals(-1, secondLargest.getSecondLargestNumber());

    }

}