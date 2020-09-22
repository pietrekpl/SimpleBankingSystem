import org.iban4j.Iban;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Transaction {
    private Iban accountNumber;
    private Owner owner;
    private Account account;
    private BigDecimal value;
    private LocalDate transactionDateAndTime;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Iban getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Iban accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getTransactionDateAndTime() {
        return transactionDateAndTime;
    }

    public void setTransactionDateAndTime(LocalDate transactionDateAndTime) {
        this.transactionDateAndTime = transactionDateAndTime;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber=" + accountNumber +
                ", account=" +
                ", owner=" + owner +
                ", value=" + value +
                ", transactionDateAndTime=" + transactionDateAndTime +
                '}';
    }

    public Transaction(Iban accountNumber, Owner owner, BigDecimal value, LocalDate transactionDateAndTime) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.value = value;
        this.transactionDateAndTime = transactionDateAndTime;
    }

    public Transaction() {
    }

    public  void makeTransaction() {
        boolean succesfullTransaction = true;
        System.out.println("Preparing new Transaction");
        Scanner scanner = new Scanner(System.in);
        Iban iban = Iban.random();
        System.out.println("Enter first name of your contact ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name of your contact");
        String lastName = scanner.nextLine();
        System.out.println("Enter address of your contact");
        String adress = scanner.nextLine();
        Owner owner = new Owner(firstName,lastName,adress);
        System.out.println("Enter date of transfer");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld = LocalDate.parse(date,dateFormat);
        System.out.println("Enter a value which you like to transfer");
        BigDecimal value  = scanner.nextBigDecimal();
        Transaction transaction = new Transaction(iban,owner,value,ld);
        Account account = new Account();
        if (account.getBalance().doubleValue() < value.doubleValue()){
            succesfullTransaction= false;
        }else {
            account.getBalance().subtract(value);
        }



    }

}
