import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CreditCard {
    private final Random random = new Random(System.currentTimeMillis());
    private String creditCardNumber;
    private int pinCode;

    public CreditCard() {
        this.creditCardNumber = generate("400000", 16);
        this.pinCode = generatePIN();
    }


    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    /* Assume our credit card's prefix should be 400000 and credit card's length as usually 16 */
    public String generate(String prefix, int length) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumberLength = length - (prefix.length() + 1);
        StringBuilder builder = new StringBuilder(prefix);
        for (int i = 0; i < randomNumberLength; i++) {
            int digit = this.random.nextInt(10);
            builder.append(digit);
        }
        int checkDigit = this.getCheckDigit(builder.toString());
        builder.append(checkDigit);
        return builder.toString();
    }

    // Luhn algorithm to check credit card validation
    private int getCheckDigit(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.substring(i, (i + 1)));

            if ((i % 2) == 0) {
                digit = digit * 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }
            sum += digit;
        }
        int mod = sum % 10;
        return ((mod == 0) ? 0 : 10 - mod);
    }

    public String cardValidate() {

        if (getCheckDigit(this.creditCardNumber) == 0) {
            return "Credit card number is valid";
        }
        return "Credit card number is Invalid";

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

    public void restrictCard() {
        System.out.println("Credit card with following number: \n" + creditCardNumber + " has been restricted");
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = localDateTime.format(timeFormatter);
        System.out.println("Since " + formatedDateTime + " credit card is marked as inactive");
    }

    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter new Pin with 4 digit number");
        String newPin = scanner.nextLine();
        while (newPin.length() != 4) {
            System.out.println("Pin must be 4 digit length");
        }
        this.pinCode = Integer.parseInt(newPin);
        System.out.println("Your new Pin is " + this.pinCode);
    }

    public void logIN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number");
        String enteredCardNumb = scanner.nextLine();
        System.out.println("Enter your PIN:");
        int enteredPIN = scanner.nextInt();
        if (!enteredCardNumb.equals(this.creditCardNumber) || enteredPIN != this.pinCode) {
            System.out.println("Wrong card number or PIN!");
        } else {
            Account account = new Account();
        }
    }

}
