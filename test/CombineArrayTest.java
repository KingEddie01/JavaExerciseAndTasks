import org.junit.Test;


import static junit.framework.TestCase.assertFalse;

public class CombineArrayTest {
    CombineReversedArray combinedArray = new CombineReversedArray();
    @Test
    public void testToCombineReversedArray(){
        int [] number = {1, 2, 3, 4, 5, 6};
        int []  value = {7,8, 9, 10};
        combinedArray.combineArray(number, value);
        combinedArray.getResult();



    }
}
