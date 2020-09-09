import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuOption = scanner.nextInt();

        Account account = new Account();
        switch (menuOption){
            case 1:
                account.showInfo();
                break;
            case 2:
                account.logIN();
            case 0:
                System.out.println("Bye");
                break;
        }




    }
}
