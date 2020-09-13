import org.iban4j.CountryCode;
import org.iban4j.Iban;

import java.math.BigDecimal;

public class Account {
    private final BigDecimal STARTMONEY = BigDecimal.valueOf(200);


    private String accountNumber;
    private Owner owner;
    private BigDecimal balance;
    private boolean isActive;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", owner=" + owner +
                ", moneyAvailible=" + balance +
                ", isActive=" + isActive +
                '}';
    }


    Iban iban = new Iban.Builder()
            .countryCode(CountryCode.PL)
            .bankCode("400000")
            .accountNumber(String.valueOf(number))
            .build();
    Iban val = Iban.valueOf(iban.toString());

    Owner owner1 = new Owner("Piotr","L","Warszawa Katowicka 1");


    public Account() {
        this.owner = owner1;
        System.out.println("Hello "+owner.getFirstName());
        this.accountNumber = val.toString();
        System.out.println("Account number : "+this.accountNumber);
        this.balance = STARTMONEY;
        System.out.println("Balance : "+ this.balance);

    }
}
