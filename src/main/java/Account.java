import java.math.BigDecimal;

public class Account {
    private long accountNumber;
    private Owner owner;
    private BigDecimal moneyAvailible;
    private boolean isActive;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public BigDecimal getMoneyAvailible() {
        return moneyAvailible;
    }

    public void setMoneyAvailible(BigDecimal moneyAvailible) {
        this.moneyAvailible = moneyAvailible;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", owner=" + owner +
                ", moneyAvailible=" + moneyAvailible +
                ", isActive=" + isActive +
                '}';
    }

    public Account(long accountNumber, Owner owner, BigDecimal moneyAvailible, boolean isActive) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.moneyAvailible = moneyAvailible;
        this.isActive = isActive;
    }

}
