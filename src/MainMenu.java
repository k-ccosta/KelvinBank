import java.util.Scanner;

public class MainMenu {
    public void showMenu(double balance) {
        Scanner input = new Scanner(System.in);
        int menuOption = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (menuOption != 4){
            System.out.println(menu);
            menuOption = input.nextInt();
        }
    }
}
