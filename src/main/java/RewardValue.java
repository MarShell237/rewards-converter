public class RewardValue {
    private double cashValue;

    private final double  CONVERTION_RATE = 0.0035;

    int convertToMiles(double cashValue){
        return (int) (cashValue*CONVERTION_RATE);
    }

    double convertToCash(int milesValue){
        return milesValue*CONVERTION_RATE;
    }
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}
