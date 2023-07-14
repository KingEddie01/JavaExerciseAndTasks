package tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

    @Test
    public void TestThatCalculatorCanFactorize() {
        Factorial factorial = new Factorial();
        factorial.convertFactorial(-8);
        int result = factorial.getResultFactorial();
        assertEquals(0, result);
    }

    @Test
    public void TestThatFiveFactorialIsEqualTo120(){
        Factorial factorial = new Factorial();
        factorial.factorialIsEqualTo(5);
        int answer = factorial.getFactorialIsEqualTo();
        assertEquals(120,answer);
    }
    @Test
    public void TestThatZeroFactorialWillGiveOne(){
        Factorial factorial = new Factorial();
        factorial.zeroFactorialToOne(0);
        int num = factorial.getOneFromZero();
        assertEquals(1,num);

    }
    @Test
    public void TestOneFactorialIsOne(){
        Factorial factorial = new Factorial();
        factorial.oneFactorialToOne(1);
        int newNum = factorial.getOneFactorialToOne();
        assertEquals(1,newNum);
    }
   @Test
    public void getFactorial(){
        Factorial factorial = new Factorial();
        factorial.theFactorialOf(31);
        int totalFactorial = factorial.totalFactorial();
        assertEquals(0,totalFactorial);
   }





    }









