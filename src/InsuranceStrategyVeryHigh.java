public class InsuranceStrategyVeryHigh extends InsuranceStrategy {
    public InsuranceStrategyVeryHigh() {
    }

    @Override
    int getAdjustment() {
        return 60000;
    }

    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    int getConstant() {
        return 105600;
    }
}