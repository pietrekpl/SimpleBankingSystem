import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOption ;

        Account account = new Account();
        do {
            menuOption = scanner.nextInt();
            switch (menuOption){
                case 1:
                    account.showInfo();
                    break;
                case 2:
                    account.logIN();
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
            }
        }while (menuOption != 0);





    }
}
