package tdd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExchangeRateTest {
    @Test
    public void ExchangeFromUsdToRmb() {
        ExchangeRate exchange = new ExchangeRate();
        exchange.myUsd(30.00);
        double usdToRmb = exchange.newRmb();
        assertEquals(3000.00, usdToRmb);

    }
    @Test
    public void ExchangeFromRmbToUsd(){
        ExchangeRate exchange = new ExchangeRate();
        exchange.myRmb(300.00);
        double rmbToUsd = exchange.newUsd();
        assertEquals(3.00,rmbToUsd);



    }





    }






