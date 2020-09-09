import java.util.Scanner;

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
    public long generateCardNumber(){
        long prefix = 400000L;
        long suffix = (long) (Math.random() * 10000000000L);
        String value = Long.valueOf(prefix)+""+Long.valueOf(suffix);
        long cardNumber = Long.parseLong(value);
        return cardNumber;
    }
    public int generatePIN(){
        int randomPin = (int)(Math.random()*9000)+1000;
        return randomPin;
    }
    public void showInfo(){
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        System.out.println(this.creditCardNumber);
        System.out.println("Your card PIN:");
        System.out.println(this.pinCode);
    }
    public void logIN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number");
        long enteredCardNumb = scanner.nextLong();
        System.out.println("Enter your PIN:");
        int enteredPIN = scanner.nextInt();
        if (enteredCardNumb != this.creditCardNumber || enteredPIN != this.pinCode){
            System.out.println("Wrong card number or PIN!");
        }
    }

    public Account() {
        this.creditCardNumber = generateCardNumber();
        this.pinCode = generatePIN();
    }
}
