package tdd;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class ArraySnackTest {

    @Test
    public void TestForLargestNumber(){
        int largest = LargestEntry.largestNumber(2, 3, 8, 10, 22, 100, 8, 9);
        assertEquals(100,largest);

    }

    }
























