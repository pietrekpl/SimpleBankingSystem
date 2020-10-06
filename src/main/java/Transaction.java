import org.iban4j.Iban;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    private static final LocalDate NOW = LocalDate.now();
    public static final List<Transaction> transactionList = new ArrayList<>();

    private Account account = new Account();
    private Iban accountNumber;
    private Owner owner;
    private BigDecimal value;
    private LocalDate transactionDateAndTime;


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

    public Transaction(Account account) {
        this.account = account;
    }

    public Transaction(Iban accountNumber, Owner owner, BigDecimal value, LocalDate transactionDateAndTime) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.value = value;
        this.transactionDateAndTime = transactionDateAndTime;
    }

    public Transaction() {
    }


    public void makeTransaction() {
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
        Owner owner = new Owner(firstName, lastName, adress);
        System.out.println("Enter date of transfer with format DD/MM/YYYY");
        String date = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, dateFormat);
        if (localDate.isBefore(NOW)) {
            System.out.println("You cannot do a time backward transaction");
            succesfullTransaction = false;
        }
        System.out.println("Enter a value which you like to transfer");
        BigDecimal value = scanner.nextBigDecimal();
        Transaction transaction = new Transaction(account);

        if (account.getBalance().intValue() < value.intValue()) {
            succesfullTransaction = false;
        } else {
            account.setBalance(account.getBalance().subtract(value));
        }
        if (succesfullTransaction) {
            System.out.println("Transaction has been made");
            System.out.println("Money value on account " + this.account.getBalance());
            transactionList.add(transaction);
        } else {
            System.out.println("There was an error while making transaction");
        }


    }

    public void showTransactions() {
        if (transactionList.isEmpty()) {
            System.out.println("No transactions so far");
        } else {
            for (Transaction transaction : transactionList) {
                System.out.println(transaction);
            }
        }
    }

}
