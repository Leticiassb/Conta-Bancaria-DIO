import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Seja bem vindo, digite sua agência: ");
        String agencia = dados.next();
        System.out.println("Agora, digite o número da sua conta: ");
        String conta = dados.next();

        /*A ideia é que o número da agência e conta seja localizado em um banco de dados
        e traga as informações do cliente sem ele precisar digitar.
         */

        String nome = "Letícia Silva";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;

        String cpf = "493887348-88";
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("Seja bem vindo(a), Sr(a): " + nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("Agência: " + agencia );
        System.out.println("Conta: " + conta );
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("\nSaldo: R$" + saldo);
        System.out.println("\n**************************");

        String menu = ("""
                    \nSelecione uma opção abaixo
                    1-Depositar
                    2-Sacar
                    3-Consultar Saldo
                    4-Sair""");

        Scanner selecao = new Scanner(System.in);


        while(opcao != 4) {
            System.out.println(menu);
            opcao = selecao.nextInt();

            if(opcao == 1){
                System.out.println("Digite o valor a ser depositado: ");
                double deposito = selecao.nextInt();
                saldo += deposito;

                System.out.println("Deposito Realizado");
                System.out.println("Seu saldo atual é de: R$" + saldo);

            } else if (opcao == 2){
                System.out.println("Digite o valor que deseja sacar: ");
                double saque = selecao.nextInt();
                if (saque > saldo) {
                    System.out.println("Não há saldo suficiente para realizar esse saque");
                } else {
                    saldo -= saque;
                    System.out.println("Saque Realizado");
                    System.out.println("Seu saldo atual é de: R$" + saldo);
                }

            } else if (opcao == 3){
                System.out.println("Seu saldo é de: R$" + saldo);

            } else if(opcao == 4){
                System.out.println("""
                        Encerrando...
                        Até a próxima!
                        """);

            } else {
                System.out.println("Digite uma opção válida");
            }



        }






    }
}


