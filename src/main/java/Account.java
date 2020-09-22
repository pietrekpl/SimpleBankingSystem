import org.iban4j.CountryCode;
import org.iban4j.Iban;

import java.math.BigDecimal;
import java.util.Scanner;

public class Account {
    private final BigDecimal STARTMONEY = BigDecimal.valueOf(200);


    private Iban accountNumber;
    private Owner owner;
    private BigDecimal balance = STARTMONEY;
    private boolean isActive;


    public Iban getIban() {
        return iban;
    }

    public void setIban(Iban iban) {
        this.iban = iban;
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

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int actionNumber;

        System.out.println("Press 1 to add money to your account");
        System.out.println("Press 2 to see your current balance");
        System.out.println("Press 0 to exit account module");
        do {
            actionNumber = scanner.nextInt();
            switch (actionNumber) {
                case 1:
                    addAmount();
                    break;
                case 2:
                    System.out.println(getBalance());
                    break;
                case 3:
                    //to implement
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        } while (actionNumber != 0);
    }

    public BigDecimal addAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money to add");
        BigDecimal amount = scanner.nextBigDecimal();
        this.balance = balance.add(amount);
        return this.balance;
    }

    public void showInfo() {
        System.out.println("Hello, " + owner.getFirstName());
        System.out.println("Account number : " + this.accountNumber);
        System.out.println("Balance : " + this.balance);
    }


    Iban iban = new Iban.Builder()
            .countryCode(CountryCode.PL)
            .bankCode("400")
            .buildRandom();

    Owner owner1 = new Owner("Piotr", "L", "Warszawa Katowicka 1");


    public Account() {
        this.owner = owner1;
        this.accountNumber = iban;
        this.balance = STARTMONEY;


    }
}
