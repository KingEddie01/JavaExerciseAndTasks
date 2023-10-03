import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumAlphaNumericTest {

    @Test
        public void testToGetSumOfNumerics(){
            Alphanumeric alphanumeric = new Alphanumeric();
            alphanumeric.sumAlphanumeric("ABC12345DF");
            assertEquals(15, alphanumeric.getSumAlphanumeric());
        }
        @Test
        public void testToGetSumOfAnotherNumerics(){
            Alphanumeric alphanumeric = new Alphanumeric();
            alphanumeric.sumAlphanumeric("ABC55555-25DF");
            assertEquals(32, alphanumeric.getSumAlphanumeric());

        }

    }

