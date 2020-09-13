import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOption;

        CreditCard creditCard = new CreditCard();
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
                case 0:
                    System.out.println("Bye");
                    break;
            }
        } while (menuOption != 0);


    }
}
