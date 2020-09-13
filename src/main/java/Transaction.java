import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private String accountNumber;
    private BigDecimal value;
    private LocalDateTime transactionDateAndTime;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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


}
