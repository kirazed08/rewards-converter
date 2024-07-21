public class RewardValue {

    private double cashValue;
    private double mileValue;
    public static final double Converter = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int mileValue){
        this.mileValue = mileValue;
    }
    public double getCashValue() {
        cashValue = mileValue*Converter;
        return cashValue;
    }

    public double getMilesValue() {
        mileValue = (cashValue *1/ Converter);
        return mileValue;
    }

    }