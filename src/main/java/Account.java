import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Account {
    private long creditCardNumber;
    private int pinCode;

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public long generateCardNumber() {
        long min = 400_000_00000_00000L;
        long max = 400_000_99999_99999L;
        long cardNumber = ThreadLocalRandom.current().nextLong(min, max + 1);
        return cardNumber;
    }

    public int generatePIN() {
        int randomPin = (int) (Math.random() * 9000) + 1000;
        return randomPin;
    }

    public void showInfo() {
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println(this.creditCardNumber);
        System.out.println("Your card PIN:");
        System.out.println(this.pinCode);
    }

    public void logIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number");
        long enteredCardNumb = scanner.nextLong();
        System.out.println("Enter your PIN:");
        int enteredPIN = scanner.nextInt();
        if (enteredCardNumb != this.creditCardNumber || enteredPIN != this.pinCode) {
            System.out.println("Wrong card number or PIN!");
        }
    }

    public Account() {
        this.creditCardNumber = generateCardNumber();
        this.pinCode = generatePIN();
    }
}
