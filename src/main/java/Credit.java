import java.math.BigDecimal;

public abstract class Credit {
    private BigDecimal totalCreditValue;
    private BigDecimal requiredStartingDeposit;
    private double interestRate;
    private int monthlyPayment;

    public BigDecimal getTotalCreditValue() {
        return totalCreditValue;
    }

    public void setTotalCreditValue(BigDecimal totalCreditValue) {
        this.totalCreditValue = totalCreditValue;
    }

    public BigDecimal getRequiredStartingDeposit() {
        return requiredStartingDeposit;
    }

    public void setRequiredStartingDeposit(BigDecimal requiredStartingDeposit) {
        this.requiredStartingDeposit = requiredStartingDeposit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "totalCreditValue=" + totalCreditValue +
                ", requiredStartingDeposit=" + requiredStartingDeposit +
                ", interestRate=" + interestRate +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }

    public Credit(BigDecimal totalCreditValue, BigDecimal requiredStartingDeposit, double interestRate) {
        this.totalCreditValue = totalCreditValue;
        this.requiredStartingDeposit = requiredStartingDeposit;
        this.interestRate = interestRate;

    }

    public Credit() {
    }
}
