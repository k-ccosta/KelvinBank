public class Main {
    public static void main(String[] args) {

        String name = "Kelvin Costa";
        String accountType = "Corrente";
        double balance = 1599.99;

        String welcome = """
                -----------------------------------------
                Bem-vindo(a) ao KelvinBank, %s
                Tipo conta: %s
                Saldo R$: %.2f
                -----------------------------------------
                """.formatted(name, accountType, balance);

        System.out.println(welcome);
    }
}