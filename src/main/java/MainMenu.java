import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menuOption;

        CreditCard creditCard = new CreditCard();
        Account account = new Account();
        Mortgage mortgage = new Mortgage();
        Transaction transaction = new Transaction(account);


        System.out.println("Press 1 to see your credit card credentials");
        System.out.println("Press 2 to login using credit card credentials");
        System.out.println("Press 3 to validate credit card");
        System.out.println("Press 4 to see moore details about your account");
        System.out.println("Press 5 to make a mortgage");
        System.out.println("Press 6 make a transfer");
        System.out.println("Press 0 to exit application");

        external:
        do {
            menuOption = scanner.nextInt();
            switch (menuOption) {
                case 1:
                    creditCard.showInfo();
                    break;
                case 2:
                    creditCard.logIN();
                    break;
                case 3:
                    System.out.println(creditCard.cardValidate());
                    break;
                case 4:
                    account.showInfo();
                    account.mainMenu();
                    break;
                case 5:
                    mortgage.makeMortgage();
                    break;
                case 6:
                    transaction.makeTransaction();
                    break;
                case 7:
                    transaction.showTransactions();
                    break;
                case 0:
                    System.out.println("Bye");
                    break external;
            }
        } while (menuOption != 0);


    }
}
