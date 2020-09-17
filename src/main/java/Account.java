import org.iban4j.CountryCode;
import org.iban4j.Iban;

import java.math.BigDecimal;
import java.util.Scanner;

public class Account {
    private final BigDecimal STARTMONEY = BigDecimal.valueOf(200);


    private Iban accountNumber;
    private Owner owner;
    private BigDecimal balance;
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
    public  void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        int actionNumber;

        do {
            actionNumber = scanner.nextInt();
            switch (actionNumber){
                case 1:
                    //to implement
                    break;
                case 2:
                    //to implement
                    break;
                case 3:
                    //to implement
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        }while (actionNumber != 0);
    }

    public BigDecimal addAmount(BigDecimal amount){
       this.balance = balance.add(amount);
       return this.balance;
    }
    public void showInfo(){
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
