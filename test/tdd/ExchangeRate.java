package tdd;

public class ExchangeRate {
    private double usd;
    private double rmb;


    public void myUsd(double rmb) {
        this.rmb = rmb;
        if (rmb > 0){
        double UsdToRmb = rmb * 100;
        this.rmb = UsdToRmb;
    }

    }

    public double newRmb() {
    return this.rmb;
    }

    public void myRmb(double rmb) {
        this.rmb = rmb;
        if (rmb > 0){
            double RmbToUsd = rmb / 100;
            this.rmb = RmbToUsd;

        }

    }

    public double newUsd() {
    return this.rmb;
    }
}
