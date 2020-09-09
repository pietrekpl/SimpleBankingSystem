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

    public Account() {
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        this.creditCardNumber = generateCardNumber();
        System.out.println(this.creditCardNumber);
        System.out.println("Your card PIN:");
        this.pinCode = generatePIN();
        System.out.println(this.pinCode);
    }
}
