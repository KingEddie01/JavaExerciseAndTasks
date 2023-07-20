package tdd;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class TestNoMultiplicationSymbol {
    @Test
    public void TestForNoMultiplicationSymbol() {
        int multiplication = Multiplication.multiply(2, 3);
        assertEquals(6, multiplication);
    }

    @Test
    public void TestForAdditionOfNumbers() {
        int[] addition = {2, 3, 4, 5, 6};
        int[] sum = NumberAddition.addTotal(addition);
        int[] total = {18, 17, 16, 15, 14};
        System.out.println(Arrays.toString(sum));
        assertEquals(Arrays.toString(sum),Arrays.toString(total));


    }
}








