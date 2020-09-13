import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private long accountNumber;
    private BigDecimal value;
    private LocalDateTime transactionDateAndTime;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    public void setTransactionDateAndTime(LocalDateTime transactionDateAndTime) {
        this.transactionDateAndTime = transactionDateAndTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber=" + accountNumber +
                ", value=" + value +
                ", transactionDateAndTime=" + transactionDateAndTime +
                '}';
    }

    public Transaction(long accountNumber, BigDecimal value, LocalDateTime transactionDateAndTime) {
        this.accountNumber = accountNumber;
        this.value = value;
        this.transactionDateAndTime = transactionDateAndTime;
    }
}
